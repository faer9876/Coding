import java.util.Scanner;
public class pt7 {
    public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("n의 값 입력 : ");
    int n= stdIn.nextInt();
    int sum=0;
    for(int i=1; i<=n; i++){
        if(i>=2){
            System.out.print("+");
        }
        System.out.print(i);
        sum += i;
    }

    System.out.println("="+sum);
}
}
