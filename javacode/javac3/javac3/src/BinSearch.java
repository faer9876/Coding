import java.util.*;
public class BinSearch {
    static int BinSearch(int[] a,int n,int key){
        int p1=0; //검색 범위의 첫 값
        int pr=n-1;//검색 범위의 마지막 값

        do{
            int pc=(p1+pr)/2;
            if(a[pc]==key)
            return pc;
            else if(a[pc]<key)
            p1=pc+1;
            else
            pr=pc-1;
        }while(p1<=pr);
        return -1;
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num=stdIn.nextInt();
        int[] x=new int[num];

        System.out.println("오름차순으로 입력");

        System.out.print("x[0] : ");//첫값 입력
        x[0]=stdIn.nextInt();

        for(int i=1;i<num;i++){
            do{
                System.out.print("x["+i+"] : ");
                x[i]=stdIn.nextInt();
            }while(x[i]<x[i-1]);
        }
        System.out.print("검색값 : ");
        int ky=stdIn.nextInt();

        int idx=BinSearch(x, num, ky);

        if(idx==-1)
        System.out.println("그 값의 요소가 없음");
        else
        System.out.println(ky+"은 x["+idx+"]에 있음");
    }
}
