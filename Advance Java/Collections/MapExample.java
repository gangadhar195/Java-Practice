package maps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapExample {
    public static void main(String args[]){
        //HashMap
        // HashMap<Integer,String> map = new HashMap<Integer,String>();
        // map.put(101, "king one");
        // map.put(102, "king Two");
        // map.put(103, "king Three");
        // map.put(104, "king Four");

        // for(Map.Entry<Integer, String> m : map.entrySet()){
        //     System.out.println(m.getKey() + " : "+ m.getValue());
        // }
        // System.out.println(map.size());
        // System.out.println(map.get(101));
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.entrySet());
        // System.out.println(map.remove(103));
        // System.out.println(map.entrySet());
        // System.out.println(map.size());

        //LinkedHashMao 
        // LinkedHashMap<String,Integer> evenNumebers = new LinkedHashMap<String,Integer>();
        // evenNumebers.put("Two", 2);
        // evenNumebers.put("Four", 4);
        // System.out.println(evenNumebers);

        // LinkedHashMap<String,Integer> numbers = new LinkedHashMap<String,Integer>(evenNumebers);

        // numbers.put("Six", 6);
        // numbers.putIfAbsent("Six", 6);
        // numbers.put("Eight", 8);
        // System.out.println(numbers);

        //weakHashMap
        WeakHashMap<String ,Integer> weak = new WeakHashMap<String,Integer>();
        weak.put("One", 1);
        weak.put("Two", 2);
        weak.put("Three", 3);
        System.out.println(weak);
        String four = "Four";
        Integer fourNum = 4;
        weak.put(four, fourNum);
        System.out.println(weak);
        four=null;
        System.gc();
        System.out.println(weak);

        weak.remove("Two");
        System.out.println(weak);
        weak.put("Five", 5);
        System.out.println(weak);

    }
}
