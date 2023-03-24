import java.util.*;
public class pt4 {
    static void copy(int[] a,int[] b){
        int num=a.length <=b.length ? a.length : b.length;
        for(int i=0;i<num;i++)
            b[i]=a[i];
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("배열 a 수 : ");
        int x=stdIn.nextInt();

        int[] a=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("a["+i+"] : ");
            a[i]=stdIn.nextInt();
        }
        System.out.print("배열 b 수 : ");
        int y=stdIn.nextInt();
        int[] b=new int[x];
        for(int i=0;i<y;i++){
            System.out.print("b["+i+"] : ");
            b[i]=stdIn.nextInt();
        }

        copy(a,b);
        System.out.println("a를 b에 copy완료");
        System.out.println("배열 출력 : ");
        for(int i=0;i<x;i++){
            System.out.println("b["+i+"] : "+a[i]);
        }

    }
}
