package h_petClinics.factories;

import h_petClinics.entities.Pet;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public final class PetFactory {
    public  Pet createPet(String name, int age, String kind) {
        return new Pet(name, age, kind);
    }
}
