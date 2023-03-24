import java.util.*;
public class pt2 {
    static void swap(int[] a,int x1,int x2){
        int t=a[x1];
        a[x1]=a[x2];
        a[x2]=t;
    }
    static void reverse(int[] a){
        System.out.print(Arrays.toString(a));
        System.out.println();
        for(int i=0; i<a.length/2; i++){
        System.out.print("a["+i+"]와"+"a["+(a.length-i-1)+"]을 교환\n");
        swap(a,i,a.length-i-1);
        System.out.println(Arrays.toString(a));
        }
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("변수값 입력 : ");
        int num=stdIn.nextInt();

        int[] y=new int[num];

        for(int i=0;i<num;i++){
            System.out.print("배열 입력 : ");
            y[i]=stdIn.nextInt();
        }
        reverse(y);
        System.out.println("역순정렬 종료");
    }
}
