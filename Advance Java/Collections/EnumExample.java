import java.util.*;

public class EnumExample {
    
        enum Size{
        SMALL,MEDIAM,LARGE,EXTRALARGE
    }
    public static void main(String args[]){
        EnumMap<Size,Integer> size = new EnumMap<>(Size.class);
        size.put(Size.SMALL, 20);
        size.put(Size.MEDIAM, 30);
        size.put(Size.LARGE, 40);
        size.put(Size.EXTRALARGE, 50);
        System.out.println(size.keySet());
        System.out.println(size.values());
        System.out.println(size.entrySet());

    }
}
