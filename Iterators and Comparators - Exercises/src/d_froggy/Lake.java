package d_froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Lake implements Iterable<Integer> {
    private int[] numbers;

    Lake(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private List<Integer> evens;
        private List<Integer> odds;
        int evenIndex;
        int oddIndex;

        Frog() {
            this.evens = new ArrayList<>();
            this.odds = new ArrayList<>();

            setEvenOddNumbers(evens, odds);
        }

        private void setEvenOddNumbers(List<Integer> evens, List<Integer> odds) {
            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 == 0) {
                    evens.add(numbers[i]);
                } else {
                    odds.add(numbers[i]);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return oddIndex < this.odds.size() || evenIndex < this.evens.size();
        }

        @Override
        public Integer next() {
            if (evenIndex < this.evens.size()) {
                return  this.evens.get(evenIndex++);
            }
            if (oddIndex < this.odds.size()) {
                return this.odds.get(oddIndex++);
            }

            return null;
        }
    }
}
