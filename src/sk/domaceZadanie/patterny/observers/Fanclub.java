package sk.domaceZadanie.patterny.observers;

import java.util.Observable;
import java.util.Observer;

public class Fanclub implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Vo fanclub sa šíri: " + arg);
    }
}
