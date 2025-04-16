package Collections;
import java.util.LinkedList;;
import java.util.List;
public class LinkListExample {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<String>();
        System.out.println(linkList.size());
        linkList.add("Ramchandra");
        linkList.add("Gangadhar");
        linkList.add("Vinayak");
        System.out.println(linkList);
        System.out.println(linkList.size());
        linkList.add(0,"Gangadhar");
        linkList.remove(2);
        for(String Value:linkList){
            System.out.println(Value);
        }
    }
}
