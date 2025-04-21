import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigbleMapExample {
    public static void main(String args[]){
        NavigableMap<String,Integer> numbers = new TreeMap<String,Integer>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println(numbers);
        System.out.println(numbers.firstKey());
        System.out.println(numbers.lastKey());
        System.out.println(numbers.pollFirstEntry());
        System.out.println(numbers.pollLastEntry());

    }
}
