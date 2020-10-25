package sk.domaceZadanie.patterny;

import sk.domaceZadanie.patterny.factory.Computer;
import sk.domaceZadanie.patterny.factory.Factory;
import sk.domaceZadanie.patterny.observers.Celebrity;
import sk.domaceZadanie.patterny.observers.Fanclub;
import sk.domaceZadanie.patterny.observers.Newspapers;
import sk.domaceZadanie.patterny.observers.Television;

public class Main {

    public static void main(String[] args) {
        System.out.println("singleton");
        singleton();
        System.out.println();
        System.out.println("factory");
        factory();
        System.out.println();
        System.out.println("observer");
        observer();
        System.out.println();
        System.out.println("builder");
        builder();
    }

    private static void observer() {
        Newspapers newspapers = new Newspapers();
        Television television = new Television();
        Fanclub fanclub = new Fanclub();

        Celebrity celebrity = new Celebrity();
        celebrity.addObserver(newspapers);
        celebrity.addObserver(television);
        celebrity.addObserver(fanclub);
        celebrity.setSprava("Budem hrat v novom filme od Marvelu");
    }

    private static void builder() {
        Computer computer = Computer.newComputer()
                .ram("Samsung")
                .hdd("SanDisk")
                .cpu("Intel")
                .build();
    }

    private static void factory() {
        Computer computer = Factory.createComputer();
    }

    private static void singleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1.equals(singleton2)) {
            System.out.println("referencie sa rovnajú");
        } else {
            System.out.println("referencie sa nerovnajú");
        }
    }
}




















