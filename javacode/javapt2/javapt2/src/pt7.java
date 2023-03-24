import java.util.*;
public class pt7 {
    static int cardConvR(int x, int r, char[] d){
        int digits=0;
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++]=dchar.charAt(x%r);
            x/=r;
        }while(x!=0);
        return digits;
    }
        public static void main(String[] args) {
            Scanner stdIn=new Scanner(System.in);
            int no; //처음 입력 10진수 정수
            int cd; //어떤 진수로 변환 할것인지에 대한 기수
            int dno; // 10진수 no를 cd진수로 변환
            int retry; //다시한번?
            char[] cno =new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자배열

            System.out.println("10진수를 변환");
            do{
                do{
                    System.out.print("변환하는 음이 아닌 정수 : ");
                    no=stdIn.nextInt();
                }while(no<0);

            do{
                System.out.print("어떤진수로 변환? (2~32) : ");
                cd=stdIn.nextInt();
            }while(cd<2 || cd>36); //cd가 2보다 작거나 36보다 크면 반복

            int x=no/cd; //10진수 no를 바꿀진수 cd로 나눈 몫
            int y=x%cd; // 10진수 no를 바꿀진수 cd로 나눈 나머지
            System.out.printf("%2d|    %2d\n",cd,no);
            System.out.print("  +----------\n");

            do{
                int t=x; //y를 계산할 x값을 저장하는 변수
                System.out.printf("%2d|    %2d.....%2d\n",cd,x,y);
                System.out.print("  +----------\n");
                x /= cd;
                y=(t%=cd);
            }while(x!=0);

            System.out.printf("         0.....%d\n",y);

            System.out.println();

            dno = cardConvR(no,cd,cno);

            System.out.print(cd+"진수로는");
            for(int i=dno-1;i>=0;i--)
            System.out.print(cno[i]);
            System.out.println("입니다.");//저장되어있는 수가 반대라서 반대로 출력

            System.out.print("한 번 더 할까요? (1예 / 2아니요) :");
            retry = stdIn.nextInt();
        }while(retry==1);
    }
}
