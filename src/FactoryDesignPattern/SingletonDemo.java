package FactoryDesignPattern;

public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton.i);
    }
}
