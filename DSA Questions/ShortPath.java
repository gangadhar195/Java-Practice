public class ShortPath {
    public static float FindShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            else if(dir=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String args[]){
        String str = "NS";
        // FindShortestPath(str);
        System.out.println(FindShortestPath(str));
    }
}
