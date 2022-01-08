

public class Variable{
    public static void main(String[] args) {
        byte cores = 8;
        short threads = 16;
        int totalCache = 16384;
        long systemMemorySpecification = 2_933_000_000l;
        float baseClock = 3.2f;
        double maxClock = 4.1;
        char memoryChannels = '2';
        boolean unlockedForOverclocking = true;
        System.out.println("Колличество ядер: " + cores);
        System.out.println("Число потоков: " + threads);
        System.out.println("Объем кэш-памяти третьего уровня: " + totalCache);
        System.out.println("Максимальное быстродействие памяти: " + systemMemorySpecification);
        System.out.println("Базовая частота: " + baseClock+"GHz");
        System.out.println("Максимальная частота: " + maxClock+"GHz");
        System.out.println("Каналы памяти: " + memoryChannels);
        System.out.println("Разблокирован для разгона: " + unlockedForOverclocking);
    }
}