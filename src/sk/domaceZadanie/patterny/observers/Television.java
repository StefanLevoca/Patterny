package sk.domaceZadanie.patterny.observers;

import java.util.Observable;
import java.util.Observer;

public class Television implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Televizia informuje: " + arg);
    }
}
