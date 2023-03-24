import java.util.Scanner;
public class pt4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count = 1; //15일때 무조건 1개가 나오기 때문에 1 입력
    int start_index = 1; //배열이 아닌 자연수로 1부터 시작
    int end_index = 1; // n값을 주어주기 전에 마지막 숫자도 1로 초기화
    int sum = 1; // 최초 합 초기화
    while (end_index != N) {
      if (sum == N) {         //sum=n일때 count 1 증가 시키고 end값 1증가후 sum합 초기화
        count++; 
        end_index++;
        sum = sum + end_index;
      } else if (sum > N) {   // sum > N 일때 
        sum = sum - start_index;
        start_index++;
      } else {                //sum < N ->  End index++;  sum = sum + End index;
        end_index++;
        sum = sum + end_index;
      }
    }
    System.out.println(count);
  }
}