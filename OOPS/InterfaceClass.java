package OOPS;

public class InterfaceClass {
    public static void main(String args[]){
        Queen q = new Queen();
        q.move();
        Child c = new Child();
        c.FName();
        c.MName();
    }
}
  interface ChessPlayer {
    void move();
 }

 class Queen implements ChessPlayer{
   public void move(){
            System.out.println("up,down,left,right,diagonal(in 4 direction)");
    }
 }
 class Rooke implements ChessPlayer{
    public void move(){
            System.out.println("up,down,left,right");

    }
 }
 class King implements ChessPlayer{
    public void move(){
            System.out.println("up,down,left,right,diagonal(by 1 step)");

    }
 }

  interface Father {
    
    public void FName();
 }
  interface Mother {
    public void MName();
 }
 class Child implements Father,Mother{
    public void FName(){
        System.out.println("Father name:");
    }
    public void MName(){
        System.out.println("Mother name:");
    }
 }