import java.util.*;
public class e_pt7 {
  public static int[] hashTable={-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

  //임의의 해시값 정해서 이 순으로 테이블에 입력(여기서는 나머지 값)
  public static int hashFunc(int data){
    return data%10;
  }

  public static void main(String[] args){
    int data, hashValue;
    Scanner scn=new Scanner(System.in);
    do{
      System.out.printf("\n저장할 데이터= ");
      data=scn.nextInt();

      if(data<0){
        break;
      }
      hashValue=hashFunc(data);

      hashTable[hashValue]=data;
    }while(true);

    do{
      System.out.printf("\n탐색할 데이터= ");
      data=scn.nextInt();

      if(data<0){
        break;
      }
      hashValue = hashFunc(data);

      if(hashTable[hashValue]==data){
        System.out.printf("%d번째에서 발견.\n",hashValue);
      }else{
        System.out.printf("에러\n");
      }
    }while(true);
    scn.close();
  }
}
