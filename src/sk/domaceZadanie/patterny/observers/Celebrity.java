package sk.domaceZadanie.patterny.observers;

import java.util.Observable;

public class Celebrity extends Observable {

    private String sprava;

    public Celebrity() {
    }

    public String getSprava() {
        return sprava;
    }

    public void setSprava(String sprava) {
        this.sprava = sprava;
        setChanged();
        notifyObservers(sprava);
    }
}
