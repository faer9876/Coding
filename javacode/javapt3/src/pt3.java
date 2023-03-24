import java.util.*;
public class pt3 {

    static int searchIdx(int[] a,int n,int key,int[] idx){//a는 입력받는 배열, n은 배열의 수, key는 찾는값, idx는 찾은 배열 위치 저장
        int count = 0; //key를 찾았을 때의 a[i]의 위치를 idx에 저장하는 수
		for (int i = 0; i < n; i++)
			if (a[i] == key)//a[i]가 key값을 찾았을 때
				idx[count++] = i; 
		return count; //a값에 따른 count수 반환
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.print("배열의 요소 개수 입력 : ");
        int x=stdIn.nextInt();
        int[] a=new int[x];
        int[] b=new int[x];

        for(int i=0;i<a.length;i++){
            System.out.print("a["+i+"] : ");
            a[i]=stdIn.nextInt();
        }

        System.out.print("검색값 : ");
        int key=stdIn.nextInt();

        int ix=searchIdx(a, x, key, b);

        if(ix==0)
        System.out.println("값이 존재하지 않음");
        else
        for(int i=0;i<ix;i++)
        System.out.print("검색값 key는 x["+b[i]+"]에 있음\n");
        System.out.println(ix+"개가 존재");
    }
}
