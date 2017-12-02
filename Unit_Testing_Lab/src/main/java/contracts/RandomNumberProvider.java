package contracts;

import java.util.Random;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface RandomNumberProvider {
    int nextInt(int bound);

    class RandomNumberImpl implements RandomNumberProvider {

        private Random rnd;

        public RandomNumberImpl() {
            this.rnd = new Random();
        }

        public int nextInt(int bound) {
            return this.rnd.nextInt(bound);
        }
    }
}
