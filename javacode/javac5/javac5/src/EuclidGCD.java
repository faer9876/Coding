import java.util.*;
public class EuclidGCD {
    static int gcd(int x,int y){
        if(y==0)
        return x;
        else
        return gcd(y,x%y);
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.println("두 정수의 최대공약수를 구함.");

        System.out.print("정수를 입력 : "); int x=stdIn.nextInt();
        System.out.print("정수를 입력 : "); int y=stdIn.nextInt();

        System.out.println("최대공약수는"+gcd(x,y)+"입니다");
    }
}
