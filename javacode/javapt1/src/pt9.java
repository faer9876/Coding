import java.util.Scanner;
public class pt9 {

    static int med1(int a, int b){
        int sum=0;

        for(int i=a; i<=b; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("a입력 : ");
        int a=stdIn.nextInt();
        System.out.print("b입력 : ");
        int b=stdIn.nextInt();

        System.out.println("a ~ b까지의 합 = "+med1(a,b));
    }
    
}
