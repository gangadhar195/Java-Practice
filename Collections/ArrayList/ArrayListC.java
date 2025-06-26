import java.util.ArrayList;

public class ArrayListC {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get operation
       int idx= list.get(2);
       System.out.println(idx);

       //remove operation
       list.remove(3);
       System.out.println(list);

       //set/update operation
       list.set(1, 8);
        System.out.println(list);
       // contains find

       System.out.println(list.contains(1));
       System.out.println(list.contains(11));

    }
}
