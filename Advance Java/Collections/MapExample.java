package maps;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(101, "king one");
        map.put(102, "king Two");
        map.put(103, "king Three");
        map.put(104, "king Four");

        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey() + " : "+ m.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.get(101));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(103));
        System.out.println(map.entrySet());
        System.out.println(map.size());

    }
}
