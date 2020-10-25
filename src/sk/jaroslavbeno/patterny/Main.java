package sk.jaroslavbeno.patterny;

import sk.jaroslavbeno.patterny.factory.Factory;
import sk.jaroslavbeno.patterny.factory.Kladivo;
import sk.jaroslavbeno.patterny.observers.Blog;
import sk.jaroslavbeno.patterny.observers.MojaOsoba;
import sk.jaroslavbeno.patterny.observers.Noviny;

public class Main {

    public static void main(String[] args) {
	 singleton();
	 factory();
	 observer();
    }

    private static void observer() {
        Blog blog = new Blog();
        Noviny noviny = new Noviny();

        MojaOsoba osoba = new MojaOsoba();
        osoba.addObserver(blog);
        osoba.addObserver(noviny);
        osoba.setSprava("Pisem novu spravu vsetkym.");

    }

    private static void builder() {
        Kladivo kladivo = Kladivo.noveKladivo()
                .farba("Biele")
                .vyrobca("OBI")
                .dlzka(40.50f)
                .build();

    }


    private static void factory() {
        Kladivo kladivo = Factory.createKladivo();
    }

    private static void singleton() {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();

        if(singletonExample.equals(singletonExample2)){
            System.out.println("rovnajú sa");
        }else{
            System.out.println("nerovnaju sa");
        }
    }
}
