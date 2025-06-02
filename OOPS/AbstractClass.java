package OOPS;

public class AbstractClass {
    public static void main(String args[]){
        Fish f= new Fish();
        f.Eates();
        Horse h = new Horse();
        h.Eats();
    }
}

abstract class Animal{
    abstract void Eats();
}
class Horse extends Animal{
    void Eats(){
        System.out.println("Eates grass");
    }
}
class Fish extends Horse{
    void Eates(){
        System.out.println("Eats small fish");
    }
}