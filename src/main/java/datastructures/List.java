package datastructures;

/**
 * @author Vincent Velthuizen
 * The basic functions any datastructures.List should implement on top of those from datastructures.Collection
 */
public interface List<E> extends Collection<E> {
    boolean add(int index, E element);

    E get(int index);

    E remove(int index);
}
