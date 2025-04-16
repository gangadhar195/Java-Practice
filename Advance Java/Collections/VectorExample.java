import java.util.Vector;

public class VectorExample {
    public static void main(String args[]){
        Vector<String> vet= new Vector<String>();
        vet.add("John");
        vet.add("Roy");
        vet.add("Filip Jey");
        System.out.println(vet.size());
        System.out.println(vet);
        // vet.remove(2);
        vet.add(0,"Rey");
        for( String value:vet){
            System.out.println(value);
        }
        System.out.println(vet.size());

    }
}
