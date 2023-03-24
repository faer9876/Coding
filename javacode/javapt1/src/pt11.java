import java.util.Scanner;
public class pt11 {
    static int Judge(int a){
        int n=0;
        while(a>0){
            a/=10;
            n++;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("a값 입력 : ");
        int a=stdIn.nextInt();

        System.out.println("a의 자릿수는 = "+Judge(a));

    }
}
