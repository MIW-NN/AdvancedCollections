package datastructures;

import java.util.Arrays;

/**
 * @author Vincent Velthuizen
 * Show a simplified version of the datastructures.ArrayList
 */
public class ArrayList<E> extends AbstractList<E> {
    private static final int INITIAL_PHYSICAL_SIZE = 10;

    private E[] contents;
    private int size;

    public ArrayList() {
        clear();
    }

    private void copy(E[] oldContents, E[] newContents) {
        if (size >= 0) {
            System.arraycopy(oldContents, 0, newContents, 0, size);
        }
    }

    private void grow() {
        E[] newContents = (E[]) new Object[contents.length * 2];
        copy(contents, newContents);
        contents = newContents;
    }

    public boolean add(E element) {
        if (size >= contents.length - 1) {
            grow();
        }
        contents[size++] = element;
        return true;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean remove(E element) {
        return false;
    }

    @Override
    public boolean add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        contents = (E[]) new Object[INITIAL_PHYSICAL_SIZE];
    }

    public E get(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException(String.format("index: %d out of bounds for size: %d", index, size));
        }
        return contents[index];
    }

    public void addAtIndex(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(String.format("index: %d out of bounds for size: %d", index, size));
        }

        if (size >= contents.length - 1) {
            grow();
        }

        for (int shiftIndex = size; shiftIndex > index; shiftIndex--) {
            contents[shiftIndex] = contents[shiftIndex - 1];
        }

        contents[index] = element;
        size++;
    }

    @Override
    public String toString() {
        return String.format("MyArrayList: %s", Arrays.toString(contents));
    }
}
