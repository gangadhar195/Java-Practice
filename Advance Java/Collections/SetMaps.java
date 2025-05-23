package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMaps {
    public static void main(String args[]){
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);
        System.out.println(set1);
        set1.remove(200);
        System.out.println(set1);

    }
}
