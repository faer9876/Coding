  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class pt6_1 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());
    int Result = 0;
    long A[] = new long[N];
    StringTokenizer st = new StringTokenizer(bf.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Long.parseLong(st.nextToken());
      System.out.println(A[i]);
    }
  }
}
