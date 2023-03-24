import java.util.*;
public class pt15 {
    static void triangleLB(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            System.out.print('*');
            System.out.println();
        }
    }

    static void triangleRB(int n){
        for(int i=1;i<=n;i++){
            for(int x=1;x<=n-i;x++)
            System.out.print(" ");
            for(int j=1;j<=i;j++)
            System.out.print('*');
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("삼각형 변 길이 입력");
        int x=stdIn.nextInt();

        System.out.print("왼쪽 아래가 직각\n");
        triangleLB(x);

        System.out.print("오른쪽 아래가 직각\n");
        triangleRB(x);
    }
}
