package OOPS;

public class InterfaceClass {
    public static void main(String args[]){
        Queen q = new Queen();
        q.move();
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