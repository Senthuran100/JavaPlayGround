package FactoryDesignPattern;

public class Singleton {
    private static Singleton instance;

    int i;

    private Singleton() {
        i = 90;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        }
        return instance;
    }
}
