import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pt1 {
  public static void main(String[] args) throws IOException {
    System.out.print("배열 수와 퀴즈값 입력 :");
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(buf.readLine());
    int suNo=Integer.parseInt(st.nextToken());
    int qizNo=Integer.parseInt(st.nextToken());
    long[] S= new long[suNo+1];
    System.out.println("값을 입력 : ");
    st = new StringTokenizer(buf.readLine());
    for(int i=1; i<=suNo;i++){
      S[i]=S[i-1]+Integer.parseInt(st.nextToken());
    }
    for(int q=0;q<qizNo;q++){
      st=new StringTokenizer(buf.readLine());
      int i=Integer.parseInt(st.nextToken());
      int j=Integer.parseInt(st.nextToken());
      System.out.println(S[j]-S[i-1]); 
    }
  }
}
