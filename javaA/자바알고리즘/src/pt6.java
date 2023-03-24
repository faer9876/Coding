import java.util.*;

public class pt6 {
  public static void main(String[] args) {
    Scanner st=new Scanner(System.in);
    int n=st.nextInt();
    int[] m=new int[n];

    for(int i=0; i<n; i++){
      m[i]=st.nextInt();
    }
    int i=0;
    int j=n-1;
    int count=0;
    while(i<j){
    if(m[i]+m[j]>n){
      j--;
    }else if(m[i]+m[j]<n){
      i++;
    }else{
    count++;
    i++;
    j--;
    }
  }
    System.out.println(count*2);
  }
}
