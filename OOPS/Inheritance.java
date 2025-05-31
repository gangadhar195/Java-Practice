package OOPS;

public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.Name();
        shark.Swwing();
        shark.Eats();
    }
}

class Animal{
    String name;
    String eats;
    void Eats(){
        System.out.println("Eats");
    }
    void Name(){
        System.out.println("Name");
    }
}
class Fish extends Animal{
    String swwing;
    void Swwing(){
        System.out.println("Fish Swwing in Water");
    }
}