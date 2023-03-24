import java.util.*;
public class pt11 {
    int y;
    int m;
    int d;

    pt11(int y,int m, int d){
        this.y=y;
        this.m=m;
        this.d=d;
    }

    static int[][] mdays={
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 평년
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 윤년
    };

    static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

    pt11 after(int n){
        pt11 temp=new pt11(this.y,this.m,this.d);
        if(n<0)
            return before(-n);

        temp.d+=n;

        while(temp.d>mdays[isLeap(temp.y)][isLeap(temp.m-1)]){
            temp.d-=mdays[isLeap(temp.y)][isLeap(temp.m-1)];
            if(++temp.m>12){
                temp.y++;
                temp.m=1;
            }
        }
        return temp;
    }
    public static void main(String[] args){

    }
}
