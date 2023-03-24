import java.util.*;
public class pt12 {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("n의 값 입력:");
        int n=stdIn.nextInt();

        System.out.print("   |");
        for(int i=1;i<=n;i++){
        System.out.printf("%3d",i);
        }
        System.out.println();
        System.out.print(" ---+----------------------------");
        System.out.println();


        for(int k=1;k<=n;k++){
            System.out.print(" "+k+" ");
            System.out.print("|");
            for(int j=1;j<=n;j++)
            System.out.printf("%3d",k*j);
            System.out.println();
        }
    }
}
