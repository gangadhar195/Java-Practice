package Collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
         list.add("King");
         list.add("Raja");
         list.add("RajaRam");
         System.out.println("Size of Array : "+list.size());
         System.out.println(list);
         list.remove(2);
         list.add(0,"Ranna");
         for(String Value : list){
            System.out.println(Value);
         }

    }

}
