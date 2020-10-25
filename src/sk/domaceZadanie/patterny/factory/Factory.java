package sk.domaceZadanie.patterny.factory;


public class Factory {

    public static Computer createComputer() {
        Computer computer = new Computer();
        System.out.println("Vytvarám počítač :)");
        return computer;
    }
}
