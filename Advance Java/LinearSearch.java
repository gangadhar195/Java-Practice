public class LinearSearch {
    public static int FindDish(String dish[],String find){
        for(int i=0;i<dish.length;i++){
            if(dish[i]==find){
                return i;
            }
        }
        return -1; 
    }
    public static void main(String args[]){
        String dish[]={"VadaPav","BhajiPav","Sandswich","MenduVada","etalli"};
        String find="VadaPava";
        int index = FindDish(dish,find);
        if(index ==-1){
            System.out.println("Dish Not Found : "+ find);
        }
        else{
        System.out.println("Dish Found At Index: "+ index);

        }
    }
}
