import java.util.*;;
public class e_pt9 {
  static void fSort(int[] a, int n, int max){
    int[] f=new int[max+1];
    int[] b=new int[n];

    for(int i=0; i<n; i++)
    f[a[i]]++; //1단계
    for(int i=1; i<=max; i++)
    f[i]+=f[i-1]; // 2단계
    for(int i=n-1;i>=0;i--)
    b[--f[a[i]]]=a[i]; // 3단계
    for(int i=0; i<n; i++)
    a[i]=b[i]; // 4단계
  }
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("도수 정렬");
    System.out.print("요소의 개수 입력 : ");
    int n=scanner.nextInt();
    int[] x=new int[n];

    for(int i=0; i<n; i++){
      do{
        System.out.print("x["+i+"] :");
        x[i]=scanner.nextInt();
      }while(x[i]<0);
    }
  int max= x[0];
  for(int i=1; i<n; i++)
    if(x[i]>max)
    max=x[i];

    fSort(x, n, max);

    System.out.println("정렬 완료");
    for (int i=0;i<n;i++)
    System.out.println("x["+i+"]="+x[i]);
  }
}


