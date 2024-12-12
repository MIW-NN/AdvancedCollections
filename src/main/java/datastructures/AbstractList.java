package datastructures;

/**
 * @author Vincent Velthuizen
 * Reusable methods for datastructures.List classes
 */
public abstract class AbstractList<E> implements List<E> {
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        
        stringBuilder.append("[");

        for (int index = 0; index < this.size(); index++) {
            if (index != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(get(index));
        }
        
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected void throwIndexOutOfBoundsException(int index) {
        throw new IndexOutOfBoundsException(String.format("index %d is out of bounds for size: %d", index, size()));
    }

    /**
     * Check whether a given index is within the array.
     * An index of size() is disallowed since there is no element there.
     * @param index The index for which to check if it is within bounds
     */
    protected void checkBounds(int index) {
        checkBounds(index, false);
    }

    /**
     * Check whether a given index is within the array.
     * For some operations an index at size() is also valid (for adding element for example).
     * @param index The index for which to check if it is within bounds
     * @param sizeAllowed Should an index at size() (invalid for get, but valid for add operations) be allowed?
     */
    protected void checkBounds(int index, boolean sizeAllowed) {
        if (    index < 0 ||
                index > size() ||
                (!sizeAllowed && index == size())) {
            throwIndexOutOfBoundsException(index);
        }
    }
}
