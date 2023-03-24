import java.util.*;

public class pt1{

    static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int x=stdIn.nextInt();

        System.out.print(x+"의 팩토리얼은 : ");
        System.out.println(factorial(x));

    }
}