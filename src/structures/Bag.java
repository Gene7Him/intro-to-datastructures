package structures;

import adts.iBag;

import java.util.Arrays;

/**
 *
 * @author Eugene
 * @version 1.0
 */
public class Bag implements iBag {
    private Object[] data;
    private int size;

    /**
     * @param capacity should not be empty
     */
    public Bag(int capacity){
        if (capacity < 0){
            throw new IllegalArgumentException("Bad bag capacity: " + capacity);
        }
        data = new Object[capacity];
    }

    /**
     * @param toAdd the element
     * @return true if the element was added
     */
    @Override
    public boolean add(Object toAdd) {
        if(size == data.length){
            return false;
        }
        data[size] = toAdd;
        //move to the next unused index in the array
        size++;

        return true;
    }

    @Override
    public boolean contains(Object searchFor) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(searchFor)){
                return true;
            }

        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return data.length;
    }

    @Override
    public boolean remove(Object searchFor) {
        if (!contains(searchFor)){
            return false;
        }

        // search for the element
        for (int i = 0; i < size; i++) {
            if (data[i].equals(searchFor)){
                //shift accordingly
                for (int j = i + 1; j < size ; j++) {
                    data[j - 1] = data[j];
                }
                data[size - 1] = null;
                size--;


                return true; // found it
            }
        }

        return false; // not found
    }

    @Override
    public boolean isEmpty(Object searchFor) {
        return size == 0;
    }

    @Override
    public void clear() {
        data = new Object[data.length];
        size = 0;

    }

    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     * @apiNote In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * The string output is not necessarily stable over time or across
     * JVM invocations.
     * @implSpec The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     */
    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}