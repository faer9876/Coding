import java.util.*;
public class Factorial {
    static int factorial(int n){
        if(n>0)
        return n*factorial(n-1);
        else
        return 1;
    }
    public static void main(String[] args) throws Exception {
        Scanner stdIn=new Scanner(System.in);
        System.out.print("정수를 입력 : "); 
        int x=stdIn.nextInt();
        System.out.println(x+"의 팩토리얼은"+factorial(x)+"입니다");
    }
}
