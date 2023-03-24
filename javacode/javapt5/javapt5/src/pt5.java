import java.util.*;
public class pt5 {
    static void recur3(int n){
        if(n>0)
        recur3(n-1);
        recur3(n-2);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("정수를 입력 : ");
        int x=stdIn.nextInt();

        recur3(x);
    }
}
