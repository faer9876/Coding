import java.util.*;;
public class e_pt8 {
  public static int[] hashTable={-1, -1, -1, -1, -1, -1, -1, -1, -1};

  public static int hashFunc(int data){
    return data%10;
  }

  public static void main(String[] args){
    int data, hashValue;
    int pos; //저장 위치 검색

    Scanner sc=new Scanner(System.in);
    do{
      System.out.printf("\n저장할 데이터= ");
      data=sc.nextInt();

      if(data<0){
        break;
      }

      hashValue=hashFunc(data);

      pos=hashValue;
      while(hashTable[pos]!=-1){
        pos++;

        if(pos>=hashTable.length){
          pos=0;
        }

        if(pos==hashValue){
          break;
        }
      }

      if(hashTable[pos]==-1){
        hashTable[pos]=data;
      }else{
        System.out.printf("해시 테이블이 가득 참\n");
      }
    }while(true);

    do{
      System.out.printf("\n검색값 입력");
      data=sc.nextInt();

      if(data<0){
        break;
      }
      hashValue=hashFunc(data);
      pos=hashValue;
      
      while(hashTable[pos]!=-1 && hashTable[pos]!=data){
        pos++;

        if(pos>=hashTable.length){
          pos=0;
        }

        if(hashTable[pos]==-1 || pos==hashValue){
          break;
        }
      }
      if(hashTable[pos]==data){
        System.out.printf("%d번째에서 발견\n",pos);
      }else{
        System.out.printf("error\n");
      }
    }while(true);
    sc.close();
  }
  
}
