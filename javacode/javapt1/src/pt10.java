import java.util.Scanner;
public class pt10 {
    static int miu(int a, int b){
        int miu=0;
        miu=b-a;

        return miu;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("a값 : ");
        int a=stdIn.nextInt();
        int b;
       do{
        System.out.print("b값 : ");
        b=stdIn.nextInt();
        System.out.println("a보다 큰 값 입력!");
       }while(b<=a);
       
       System.out.println("a - b=" + miu(a,b));
    }
    
}
