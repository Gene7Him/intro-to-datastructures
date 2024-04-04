package adts;

/**
 *
 * @author Eugene
 * @version 1.0
 */
public interface iBag {
    /**
     *
     * @param toAdd the element
     * @return true if the element was added
     */
    boolean add(Object toAdd);
    boolean contains(Object searchFor);
    int size();
    int capacity();
    boolean remove(Object searchFor);
    boolean isEmpty(Object searchFor);
    void clear();
}

