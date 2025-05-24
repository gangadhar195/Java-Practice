public class TrapRainWater {
    public static void TrapWater(int heights[]){
        int n = heights.length;
        int leftMax[] = new int [n];
        leftMax[0] = heights[0];
        //left max
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(heights[i],leftMax[i-1]);
        } 
        //rightmax
        int rightmax[] = new int[n];
        rightmax[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(heights[i], rightmax[i+1]);

        }
        //find water level
        int trapwater = 0;
        
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftMax[i], rightmax[i]);
            trapwater += waterlevel - heights[i];
        }
        System.out.println(trapwater);
    }
    public static void main(String args[]){
        int heights[] = {4,2,0,6,3,2,5};
        TrapWater(heights);
    }
}
