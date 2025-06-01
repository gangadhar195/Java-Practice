package OOPS;

public class Inheritance {
    public static void main(String args[]){
        //sigle inheritance
        // Fish shark = new Fish();
        // shark.Name();
        // shark.Swwing();
        // shark.Eats();

        //multilevel inheritance
        // Paplate p = new Paplate();
        // p.Name();
        // p.Swwing();
        // p.papy();

        //Hirarchical inheritance
        // Lion l=new Lion();
        // l.Eats();
        // Fish f = new Fish();
        // f.Eats();

        //Hybride 
        KingOfForest kf = new KingOfForest();
        kf.EatsLion();
        kf.Jungle();

    }
}

// class Animal{
//     String name;
//     String eats;
//     void Eats(){
//         System.out.println("Eats");
//     }
//     void Name(){
//         System.out.println("Name");
//     }
// }
// class Fish extends Animal{
//     //child
//     String swwing;
//     void Swwing(){
//         System.out.println("Fish Swwing in Water");
//     }
// }
// //grand child
// class Paplate extends Fish{
//     String size="Faty";
//     void papy(){
//         System.out.println(size +" ");
//     }
// }

//Base
class Animal{
    String eat;
   void Eats(){
    System.out.println("Eats Non-veage");
   }
}
class Fish extends Animal{
void EatsFish(){
        System.out.println("Live in Water");
    }
}
 class Lion extends Animal{
 void EatsLion(){
        System.out.println("live in Land");
    }
 }
 class KingOfForest extends Lion{
    void Jungle(){
    System.out.println("King of Jumgle");
    }
 }