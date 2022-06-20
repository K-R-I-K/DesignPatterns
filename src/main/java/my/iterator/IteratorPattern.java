package Iterator;

import java.util.Iterator;

class IteratorPattern implements Iterable<Integer>
{
    int start;
    int end;

    IteratorPattern(int start, int end){
        this.start = start;
        this.end = end;
    }

    public static IteratorPattern startFinish(int start, int finish){
        return new IteratorPattern(start, finish);
    }

    @Override
    public Iterator iterator() {                        // return own created iterator like default
        return new OwnIterator(start);
    }

    class OwnIterator implements Iterator<Integer>      // describes own iterator
    {
        private int current;

        public OwnIterator(int current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current <= end;
        }

        @Override
        public Integer next() {
            return current++;
        }
    }
}

