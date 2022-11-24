import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int max;
    protected int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        random = new Random();
    }
    @Override
    public Iterator<Integer> iterator() {
        return new IntegerIterator();
    }
    private class IntegerIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }
        @Override
        public Integer next() {
            return random.nextInt(max + 1 - min) + min;
        }
    }
}