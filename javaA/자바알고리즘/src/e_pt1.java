public class e_pt1 {

  public static void printArray(int[] a){
      for(int i=0; i<a.length; i++){
        System.out.println("["+a[i]+"]");
    }
    System.out.println("\n");
  }
    public static void main(String[] args){
      int[] a={90,34,78,12,56};
      int ins, cmp, temp;

      System.out.print("정렬 전 배열\n");
      printArray(a);
      //오름차순 정렬
      for(ins=1;ins<a.length;ins++){
        temp=a[ins]; //temp에 초기값 넣기
        for(cmp=ins-1;cmp>=0;cmp--){
          if(a[cmp]>temp){
            a[cmp+1]=a[cmp]; //자리 바꾸기
          }else{
            break;
          }
        }a[cmp+1]=temp; //그리고 cmp+1 값에 현재값 대입
      }

      //정렬 후
      System.out.print("정렬 후 배열\n");
      printArray(a);
    }

} 
