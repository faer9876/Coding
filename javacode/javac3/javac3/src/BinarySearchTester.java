import java.util.*;
public class BinarySearchTester {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x=new int[num]; //요솟수가 num인 배열

        System.out.println("오름차순으로 정렬");

        System.out.print("x[0] : "); //첫번째 요소를 우선으로 입력
        x[0]=stdIn.nextInt();

        for(int i=1;i<num;i++){
            do{
                System.out.print("x["+i+"] : ");
                x[i]=stdIn.nextInt();
            }while(x[i]<x[i-1]);
        }
        System.out.print("검색할 값 : ");
        int ky=stdIn.nextInt();

        int idx=Arrays.binarySearch(x, ky); //배열 x에서 키 값이 ky인 요소를 검색

        if(idx<0)
        System.out.println("그 값의 요소가 없습니다.");
        else
        System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
    }
}
