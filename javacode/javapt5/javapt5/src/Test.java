import java.util.*;
public class Test {
    static void recur3(int n){
        int[] nstk=new int[100];
        int[] sstk=new int[100];
        int ptr=-1;
        int sw=0;

        //n=1 ,2, 1, 3  순이 되어야 함
        while(true){
            if(n>0){
                ptr++;  //0에서 시작 0 1 2
                nstk[ptr]=n;   //n=0 까지 계속 -- 0->3 1->2 2->1 ptr=3 n=1
                sstk[ptr]=sw; //n<0까지 계속 0 0->0 1->0 2->0 ptr=3 sw=2
                if(sw==0)
                    n=n-1; //3~0
                else if(sw==1){
                    n=n-2; 
                    sw=0; 
                }
                continue; //n<0에서 탈출
            }
            do{
                n=nstk[ptr];  //ptr=2 n=1 ptr=1 n=2
                sw=sstk[ptr--]+1; //ptr=1 sw=1 ptr=0 sw=2

                if(sw==2){
                    System.out.println(n);  //n=1
                    if(ptr<0) 
                    return;
                }
            }while(sw==2);
        }
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.print("정수를 입력 : ");
        int x=stdIn.nextInt();

        recur3(x);
}
}
