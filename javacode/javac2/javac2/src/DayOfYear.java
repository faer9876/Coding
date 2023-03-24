import java.util.*;
public class DayOfYear {
    static int[][] mdays={
        {31,28,31,30,31,30,31,31,30,31,30,31}, //평년
        {31,29,31,30,31,30,31,31,30,31,30,31}  //윤년
    };

    static int isLeap(int year){
        return (year % 4==0 && year%100!=0 ||year%400==0)? 1:0; //서기 year년은 윤년인가(1=윤년 0=평년)
    }

    static int dayOfYear(int y, int m, int d){
        int days=d;

        for(int i=1;i<m;i++)
        days += mdays[isLeap(y)][i-1];
        return days;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        int retry;

        System.out.println("그 해의 경과 일수를 구합니다.");

        do{
            System.out.print("년:"); int year = stdIn.nextInt();
            System.out.print("월:"); int month =stdIn.nextInt();
            System.out.print("일:"); int day=stdIn.nextInt();

            System.out.printf("그 해 %d일째 입니다.\n",dayOfYear(year,month,day));

            System.out.print("한번더? (1=예,2=아니오) : ");
            retry=stdIn.nextInt();
        }while(retry==1);
    }
}
