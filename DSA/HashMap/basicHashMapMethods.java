import java.util.HashMap;
import java.util.Map;

public class basicHashMapMethods 
{
    public static void main(String[] args) 
    {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // 1. put() - Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("HashMap after put operations: " + map);

        // 2. putIfAbsent() - Insert only if key is not already present
        map.putIfAbsent(2, "Blueberry"); // won't overwrite Banana
        map.putIfAbsent(4, "Date");
        System.out.println("HashMap after putIfAbsent: " + map);

        // 3. get() - Retrieve value by key
        System.out.println("Value for key 3: " + map.get(3));

        // 4. getOrDefault() - Retrieve value or default if key not found
        System.out.println("Value for key 5 (default): " + map.getOrDefault(5, "Not Found"));

        // 5. containsKey() - Check if key exists
        System.out.println("Does key 2 exist? " + map.containsKey(2));

        // 6. containsValue() - Check if value exists
        System.out.println("Does value 'Cherry' exist? " + map.containsValue("Cherry"));

        // 7. remove() - Remove by key
        map.remove(1);
        System.out.println("HashMap after removing key 1: " + map);

        // 8. replace() - Replace value for a key
        map.replace(2, "Blackberry");
        System.out.println("HashMap after replace: " + map);

        // 9. size() - Number of entries
        System.out.println("Size of HashMap: " + map.size());

        // 10. isEmpty() - Check if map is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // 11. keySet() - Get all keys
        System.out.println("Keys: " + map.keySet());

        // 12. values() - Get all values
        System.out.println("Values: " + map.values());

        // 13. entrySet() - Get all key-value pairs
        System.out.println("Entries: " + map.entrySet());

        // 14. Iteration using for-each loop
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) 
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 15. clear() - Remove all entries
        map.clear();
        System.out.println("HashMap after clear: " + map);
        System.out.println("Is HashMap empty now? " + map.isEmpty());
    }
}
