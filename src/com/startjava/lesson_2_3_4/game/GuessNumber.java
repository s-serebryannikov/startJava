package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player[] players = new Player[3];
    private int hiddenNum;
    Scanner scanner = new Scanner(System.in);

    GuessNumber(Player p1, Player p2, Player p3) {
        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
    }

    public void start() {
        lotPlayers(players);
        while (players[0].getCountWin() != 3 && players[1].getCountWin() != 3 && players[2].getCountWin() != 3) {
            initGame();
            do {
                if (inputNum()) {
                    break;
                }
            } while (!checkAttempts(players[0]) && !checkAttempts(players[1]) && !checkAttempts(players[2]));
            showEnteredNumbers();
            showResults();
        }
        winnerPlayer(players[0], players[1], players[2]);
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
        }
        return false;
    }

    private boolean checkAttempts(Player p) {
        if ((p.getCount()) == 10) {
            System.out.println("У " + p.getName() + " закончились попытки");
            return true;
        }
        return false;
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
            p.setCountWin();
            return true;
        }
        return false;
    }

    private void showEnteredNumbers() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Значения игрока " + players[i].getName() + ": ");
            for (int num : players[i].getEnteredNums()) {
                if (num > 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }

    private void lotPlayers(Player[] players) {
        Random random = new Random();
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " для участия в жребии нажмите Enter");
            scanner.nextLine();
            player.setLot(random.nextInt(11) + 1);
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

    private void winnerPlayer(Player p1, Player p2, Player p3) {
        if (p1.getCountWin() == 3) {
            System.out.println("\nПобедитель по результатам 3х игр " + p1.getName() + "\n");
        } else if (p2.getCountWin() == 3) {
            System.out.println("\nПобедитель по результатам 3х игр " + p2.getName() + "\n");
        } else
            System.out.println("\nПобедитель по результатам 3х игр " + p3.getName() + "\n");
    }

    private void showResults() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("У игрока " + players[i].getName() + " колличество побед - " + players[i].getCountWin());
        }
    }
}