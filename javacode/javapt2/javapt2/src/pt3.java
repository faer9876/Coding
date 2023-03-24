import java.util.*;
public class pt3 {
    static int sumOf(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int s=stdIn.nextInt();

        int[] k=new int[s];

        for(int i=0;i<s;i++){
            System.out.print("k["+i+"] : ");
            k[i]=stdIn.nextInt();
        }

        System.out.println(sumOf(k));
    }
    
}
