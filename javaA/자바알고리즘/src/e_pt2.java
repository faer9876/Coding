public class e_pt2 {
  public static void printArray(int[] a){
    for(int i=0; i<a.length; i++){
      System.out.print("["+a[i]+"]");
    }
    System.out.print("\n");
  }
  public static void main(String[] args){
    int[] a={90,43,78,12,56}; //첫번째 부터 끝으로 제일 큰 수를 보냄
    int ins,cmp,temp;
    printArray(a); //배열의 길이가 5임을 확인
    System.out.print("\n");
    System.out.println(a.length);
    for(ins=0;ins<a.length-1;ins++){
      for(cmp=0;cmp<a.length-ins-1;cmp++){
        if(a[cmp]>a[cmp+1]){
          temp=a[cmp];
          a[cmp]=a[cmp+1];
          a[cmp+1]=temp;
        }
      }
    }
    printArray(a);
  }
}
