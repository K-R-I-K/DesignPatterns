package my.iterator;

import java.lang.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class that represent some methods to implements some Iterators.
 * It lets traverse elements of a collection without exposing its underlying representation.
 */
class Iterators {
    /**
     * Method that return Iterator that iterates over given array but returns each array element 2 times.
     * @param array Array of ints that we used to create new Iterator.
     * @return An Iterator that iterates over given array but returns each array element 2 times.
     */
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
    /**
     * Method that returns Iterator that iterates over given array but returns each array element 3 times.
     * @param array Array of ints that we used to create new Iterator.
     * @return An Iterator that iterates over given array but returns each array element 3 times.
     */
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
    /**
     * Method that returns Iterator that iterates over given array but returns each array element 5 times.
     * @param array Array of ints that we used to create new Iterator.
     * @return An Iterator that iterates over given array but returns each array element 5 times.
     */
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

    /**
     * Method that returns an Iterator that iterates over cells - pairs of given columns and rows.
     * @param columns Array of String that we used to create new Iterator.
     * @param rows Array of ints that we used to create new Iterator.
     * @return Specific Iterator that iterates over cells - pairs of given columns and rows.
     */
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
