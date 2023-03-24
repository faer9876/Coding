import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class pt5 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());
    int M = Integer.parseInt(bf.readLine());
    int[] A = new int[N]; // A배열 선언
    StringTokenizer st = new StringTokenizer(bf.readLine());// 띄어쓰기 기준 입력받은 문자열을 생성된 배열에 개별로 입력
    
    // N이 될때까지 배열에 문자열 입력
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    // 배열을 작은수 부터 차례로 정렬
    Arrays.sort(A);

    //초기 변수값 초기화
    int count = 0;
    int i = 0;   //처음
    int j = N - 1; //끝 

    //투 포인터 방식으로 count 구함    ai+aj=sum으로 생각        s>n :  s=s-start; start++
    while (i < j) {                                  //  s<n : end++; s=s+end
      if (A[i] + A[j] < M) {                        //   s==n : end++; s=s+end; count++
        i++;
      } else if (A[i] + A[j] > M) {
        j--;
      } else {
        count++;
        i++;
        j--;
      }
    }
    System.out.println(count);
    bf.close();
  }
}