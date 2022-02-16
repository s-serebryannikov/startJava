package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player[] players;
    private int hiddenNum;
    Scanner scanner = new Scanner(System.in);

    GuessNumber(Player[] players) {
        this.players = players;
        inputName();
    }

    public void start() {
        System.out.println("У вас по 10 попыток что бы угадать загаданное слово");
        castLot(players);
        while (checkWinnerPlayer()) {
            initGame();
            do {
                if (inputNum()) {
                    break;
                }
            } while (!checkAttempts(players[players.length - 1]));
            showEnteredNumbers();
            showResults();
        }
    }

    private void initGame() {
        Random random = new Random();
        hiddenNum = random.nextInt(100) + 1;
        for (Player player : players) {
            player.clearNumbers();
        }
    }

    private boolean inputNum() {
        for (Player player : players) {
            while (true) {
                System.out.println("\nИгрок " + player.getName() + " попробуйте угадать число: ");
                int number = scanner.nextInt();
                if (player.addNum(number)) {
                    break;
                }
                System.out.println("Число " + number + " не входит в диапазон (0,100]\nПопробуйте ещё раз");
            }
            if (compareNum(player)) {
                return true;
            }
            if (checkAttempts(player)) {
                System.out.println("У " + player.getName() + " закончились попытки");
            }
        }
        return false;
    }

    private boolean checkAttempts(Player p) {
        return (p.getCount()) == 4;
    }

    private boolean compareNum(Player p) {
        int number = p.getEnteredNums()[p.getCount() - 1];
        String name = p.getName();
        if (number < hiddenNum) {
            System.out.println("Игрок " + name + ", данное число меньше того, что загадал компьютер");
        } else if (number > hiddenNum) {
            System.out.println("Игрок " + name + ", данное число больше того, что загадал компьютер");
        } else {
            System.out.println("\nИгрок " + name + " вы победили!");
            System.out.println("Игрок " + name + " угадал число " + number + " с " + p.getCount() + " попытки\n");
            p.setCountWin(1);
            return true;
        }
        return false;
    }

    private void showEnteredNumbers() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Значения игрока " + players[i].getName() + ": ");
            for (int num : players[i].getEnteredNums()) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void castLot(Player[] players) {
        Random random = new Random();
        scanner.nextLine();
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " для участия в жребии нажмите Enter");
            scanner.nextLine();
            player.setLot(random.nextInt(11) + 1);
            player.setCountWin(0);
        }
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return p2.getLot() - p1.getLot();
            }
        });
        System.out.println("Игроки угадывают в следующем порядке: ");
        for (Player p : players) {
            System.out.println("Игрок " + p.getName() + " - число жребия " + p.getLot());
        }
    }

    private boolean checkWinnerPlayer() {
        for (Player player : players) {
            if (player.getCountWin() == 3) {
                System.out.println("\nПобедитель по результатам 3х игр " + player.getName() + "\n");
                return false;
            }
        }
        return true;
    }

    private void showResults() {
        for (Player player : players) {
            System.out.println("У игрока " + player.getName() + " колличество побед - " + player.getCountWin());
        }
    }

    private void inputName() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Игрок " + (i + 1) + ", введите своё имя :");
            players[i] = new Player(scanner.nextLine());
        }
    }
}