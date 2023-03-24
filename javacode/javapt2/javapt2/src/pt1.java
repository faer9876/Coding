import java.util.*;
public class pt1 {
    static int maxOf(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++)
        if(a[i]>max)
        max=a[i];

        return max;
    }
    public static void main(String[] args){
        Random r=new Random();
        
        int n=0;
        do{
        n= r.nextInt(10);
        }while(n<=0);

        int[] height=new int[n];

        for(int i=0;i<n;i++){
            height[i]=100+r.nextInt(90);
            System.out.println("height["+i+"]="+height[i]);
        }
        System.out.println("키의 최댓값은"+maxOf(height)+"입니다");
    }
}
