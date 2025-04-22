public class MergeSort {

    public static int[] Merge(int a1[],int a2[]){
            int n1 = a1.length, n2=a2.length;
                int a3[] = new int[n1+n2];
                int p1=0,p2=0;
                for(int i =0;i<a3.length;i++)
                {
                    int val1 =(p1<n1)?a1[p1]:Integer.MAX_VALUE;
                    int val2 =(p2<n2)?a2[p2]:Integer.MAX_VALUE;

                    if(val1<=val2){
                        a3[p1]=val1;
                        p1++;
                    }
                    else{
                        a3[p2]=val2;
                        p2++;
                    }
                }
        return a3;
    }
    public static void main(String args[]){
        int a1[] = {10,20,30,40,50};
        int a2[] = { 20,70,80,90};

        int a3[] = Merge(a1,a2);
        for(int i=0;i<a3.length;i++){
            System.out.print(a3[i]+"\t");
        }

    }
}
