package my.iterator;

import java.lang.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Iterators {

    public static Iterator<Integer> intArrayTwoTimesIterator(int[] array){
        return new Iterator<>() {
            private int currentIndex = 0;
            final private int count = 2;

            @Override
            public boolean hasNext() {
                return currentIndex < array.length * count;
            }

            @Override
            public Integer next() {
                if (hasNext())
                    return array[(currentIndex++) / count];
                throw new NoSuchElementException();
            }
        };
    }

    public static Iterator<Integer> intArrayThreeTimesIterator(int[] array) {
        return new Iterator<>() {
            private int currentIndex = 0;
            final private int count = 3;

            @Override
            public boolean hasNext() {
                return currentIndex < array.length * count;
            }

            @Override
            public Integer next() {
                if (hasNext())
                    return array[(currentIndex++) / count];
                throw new NoSuchElementException();
            }
        };
    }

    public static Iterator<Integer> intArrayFiveTimesIterator(int[] array) {
        return new Iterator<>() {
            private int currentIndex = 0;
            final private int count = 5;

            @Override
            public boolean hasNext() {
                return currentIndex < array.length * count;
            }

            @Override
            public Integer next() {
                if (hasNext())
                    return array[(currentIndex++) / count];
                throw new NoSuchElementException();
            }
        };
    }

    public static Iterable<String> table(String[] columns, int[] rows){
        return () -> new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < columns.length * rows.length;
            }

            @Override
            public String next() {
                if (hasNext())
                    return columns[currentIndex / rows.length] + rows[(currentIndex++) % rows.length];
                throw new NoSuchElementException();
            }
        };
    }



}
