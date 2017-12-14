package a_EventImplementation.models;

import a_EventImplementation.contracts.NameChangeListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Dispatcher {
    private String name;
    private List<NameChangeListener> listeners;

    public Dispatcher(String name) {
        this.name = name;
        this.listeners = new ArrayList<>();
    }

    public void changeName(String nameParam) {
        if (!this.name.equals(nameParam)) {
            this.name = nameParam;
            this.fireNameChangeEvent();
        }
    }

    public void addNameChangeListener(NameChangeListener listener) {
        this.listeners.add(listener);
    }

    public void removeNameChangeListener(NameChangeListener listener) {
        this.listeners.remove(listener);
    }

    public void fireNameChangeEvent() {
        NameChange event = new NameChange(this.name);
        this.listeners.forEach(x -> x.handleChangedName(event));
    }
}
