package datastructures;

/**
 * @author Vincent Velthuizen
 * A datastructures.Set based on the HashTable concept
 */
public class HashSet<E> implements Set<E> {
    private static final int CAPACITY = 31;
    private E[] elements;
    private int size;

    public HashSet() {
        clear();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        this.size = 0;
        elements = (E[]) new Object[CAPACITY];
    }

    @Override
    public boolean add(E element) {
        if (contains(element)) {
            // TODO element should still be updated!
            return false;
        } else {
            int index = getIndex(element);

            // while the index is not empty, find an empty place
            while (elements[index] != null) {
                index = getNextIndex(index);
            }
            elements[index] = element;
            size++;
            return true;
        }
    }

    @Override
    public boolean remove(E element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(E element) {
        int index = getIndex(element);
        while (elements[index] != null) {
            if (elements[index].equals(element)) {
                return true;
            }
            index = getNextIndex(index);
        }
        return false;
    }

    private int getIndex(E element) {
        return element.hashCode() % elements.length;
    }

    private int getNextIndex(int index) {
        return (index + 1) % elements.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MyHashSet: ");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                stringBuilder.append(String.format("\nindex %3d: %s", i, elements[i].toString()));
            }
        }
        return stringBuilder.toString();
    }
}
