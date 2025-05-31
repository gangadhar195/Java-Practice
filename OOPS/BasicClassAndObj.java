package OOPS;

public class BasicClassAndObj {
    public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setColor("Red");
    System.out.println(p1.color);
    p1.color="Green";
    System.out.println(p1.color);
    p1.setTip(10);
    p1.tip=20;
    System.out.println(p1.tip);
    
 }
}

class Pen{
   public String color;
   protected int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
