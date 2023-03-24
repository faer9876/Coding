import java.util.*;
public class Test4 {
    //n=3
    static void recur3(int n){
        if(n>0){
            recur3(n-1); //n=2출력(2) n=1출력(1) 
            recur3(n-2); //n=1(출력)   
            System.out.println(n);   //n=3(3)출력
        }
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int x=stdIn.nextInt();

        recur3(x);
    }
}
