package h_petClinics.factories;

import h_petClinics.entities.Clinic;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public final class ClinicFactory {
    public Clinic createClinic(String name, int rooms) {
        return new Clinic(name, rooms);
    }
}
