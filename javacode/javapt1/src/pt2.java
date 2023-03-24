package pt;
import java.util.Scanner;

import java.util.Scanner;
public class pt2 {
    
    static int min3(int a, int b, int c){
        int min=a;
        
        if(b<min)
        min=b;
        if(c<min)
        min=c;

        return min;
    }

    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("a의 값 : "); int a1=stdIn.nextInt();
        System.out.print("b의 값 : "); int b1=stdIn.nextInt();
        System.out.print("c의 값 : "); int c1=stdIn.nextInt();

        System.out.println("min 의 값 : "+ min3(a1,b1,c1));
        
    }
}
