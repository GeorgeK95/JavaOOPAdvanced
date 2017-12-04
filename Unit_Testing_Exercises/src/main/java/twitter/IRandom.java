package twitter;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IRandom {
    int nextInt(int max);

    class Random implements IRandom {
        private java.util.Random rand;

        public Random() {
            rand = new java.util.Random();
        }

        @Override
        public int nextInt(int max) {
            return this.rand.nextInt(max);
        }
    }
}
