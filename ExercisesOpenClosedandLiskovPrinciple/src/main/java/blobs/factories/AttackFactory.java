package blobs.factories;

import blobs.interfaces.Attack;
import blobs.models.attacks.Blobplode;
import blobs.models.attacks.PutridFart;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class AttackFactory {
    public static Attack generateAttack(String type) {
        if (type.equals("Blobplode")) {
            return new Blobplode();
        } else if (type.equals("PutridFart")) {
            return new PutridFart();
        }
        return null;
    }
}
