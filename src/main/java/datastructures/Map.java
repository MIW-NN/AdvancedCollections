package datastructures;

/**
 * @author Vincent Velthuizen
 * Connect elements of one type to elements of another
 */
public interface Map<K, V> {
    void clear();

    int size();

    V put(K key, V value);

    V get(K key);

    V remove(K key);

    Set<K> keySet();

    boolean containsKey(K key);
}
