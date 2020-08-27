import java.util.LinkedHashMap;
import java.util.Map;

public class LruNaive {
    public static void main(String[] args) {
        // ["LRUCache","put","put","put","put","get","get"]
        // [[2],[2,1],[1,1],[2,3],[4,1],[1],[2]]
        LRU cache = new LRU(2);
        cache.put(2, "1");
        cache.put(1, "1");
        cache.put(2, "3");
        cache.put(4, "1");
        cache.get(1);
        // cache.put(4, "4");
        cache.get(2);
        cache.put(5, "5");
    }

}

class LRU {
    Map<Integer, String> map;
    int capacity;
    public LRU(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<Integer, String>();
        // {
        //     protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        //         return size() > capacity;
        //     }
        // };
    }

    public String get(int key) {
        if (!map.containsKey(key)) {
            return null;
        }
        String current = map.remove(key);
        map.put(key, current);
        return current;
    }

    public void put(int key, String value) {
        // if (map.containsKey(key)) {
        //     map.remove(key);
        // }
        map.put(key, value);
        if (map.size() > capacity) {
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
    }
}