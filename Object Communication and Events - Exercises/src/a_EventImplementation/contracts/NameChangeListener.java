package a_EventImplementation.contracts;

import a_EventImplementation.models.NameChange;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface NameChangeListener {
    void handleChangedName(NameChange event);
}
