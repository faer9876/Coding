package pt;
import java.util.Scanner;
public class pt1 {

    static int max4(int a, int b, int c, int d){
        int max=a;
        if(b>max)
         max=b;
        if(c>max);
         max=c;
        if(d>max)
         max=d;
        
         return max;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a1의 값 : "); int a1=stdIn.nextInt();
        System.out.print("b1의 값 : "); int b1=stdIn.nextInt();
        System.out.print("c1의 값 : "); int c1=stdIn.nextInt();
        System.out.print("d1의 값 : "); int d1=stdIn.nextInt();
        
        System.out.println("max의 값 =" + max4(a1,b1,c1,d1));

    }
}
