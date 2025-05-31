package OOPS;

public class BasicClassAndObj {
    public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setColor("Red");
    System.out.println(p1.getColor());
    // p1.color="Green";
    System.out.println(p1.getColor());
    p1.setTip(10);
    // p1.tip=20;
    System.out.println(p1.getTip());
    
 }
}

class Pen{
   private String color;
   protected int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
