import java.util.*;
public class pt16 {
    static void spira(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
            System.out.print('*');
            System.out.println();
        }
    }
    public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    System.out.print("단 입력 : ");
    int x=stdIn.nextInt();

    System.out.print("피라미드 출력 \n");
    spira(x);
}
}
