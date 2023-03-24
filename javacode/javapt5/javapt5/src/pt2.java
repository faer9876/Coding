import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class pt2 {
    static int Gcd(int x, int y){
        int temp;
        while(y!=0){
            if(x<y){
            temp=x;
            x=y;
            y=temp;
            }
            else
            x=y;
            y=(x%y);
        }return x;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("두 정수를 입력\n");
        System.out.print("정수를 입력 : "); int x=stdIn.nextInt();
        System.out.print("정수를 입력 : "); int y=stdIn.nextInt();

        System.out.print("두 정수의 gcd는 :");
        System.out.print(Gcd(x, y));
        System.out.println();
    }
    
}
