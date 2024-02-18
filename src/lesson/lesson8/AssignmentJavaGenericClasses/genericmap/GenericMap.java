package lesson.lesson8.assignmentjavagenericclasses.genericmap;

import java.util.HashMap;
// HashMap implements the Map interface (need import)
// HashMap is similar to ArrayList, but with key-value pairs
// stores objects, need to use Wrapper Class
// ex: (name, email), (username, userID), (country, capital)
import java.util.Map;

public class GenericMap<K, V> {
    // Private field to store key-value pairs using a Map
    private Map<K, V> map;

    // Constructor initializes the map with a new HashMap
    public GenericMap() {
        this.map = new HashMap<>();
    }

    // The add method adds a new key-value pair to the map using the put method of
    // the underlying HashMap. It associates the specified value with the specified
    // key.
    public void add(K key, V value) {
        map.put(key, value);
    }

    // The get method retrieves the value associated with the specified key using
    // the get method of the underlying HashMap.
    public V get(K key) {
        return map.get(key);
    }

    // The containsKey method checks if the map contains the specified key using the
    // containsKey method of the underlying HashMap. It returns true if the key is
    // present, otherwise false.
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    // The remove method removes the key-value pair associated with the specified
    // key using the remove method of the underlying HashMap.
    public void remove(K key) {
        map.remove(key);
    }
}
