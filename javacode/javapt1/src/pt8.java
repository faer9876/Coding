import java.util.Scanner;
public class pt8 {

    static int Gauess(int a){
        int sum=0;
        sum=(a*(a+1))/2;

        return sum;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("a값 입력 : ");
        int a=stdIn.nextInt();

        System.out.println("1부터 a까지의 합 = "+ Gauess(a));
    }
    
}
