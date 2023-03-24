import java.util.Scanner;
import java.util.Stack;
public class pt8{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Stack<Integer> stack = new Stack<>();
    StringBuffer bf = new StringBuffer();
    int num = 1;
    for (int i = 0; i < A.length; i++) {
      int su = A[i];
      if (su >= num) { 
        while (su >= num) { 
          stack.push(num++); // 1부터 스택에 넣어주면서 스택값 1씩늘림
          bf.append("+\n"); // 그리고 +출력 다음 자연수 값으로 넘버 계속 증가시키고
        }
        stack.pop(); // 넘버보다 수를 넘으면 팝을 함
        bf.append("-\n"); //그리고 - 출력
      }
      else {  //애초에 넘버가 수 보다 작을 때 여기서 넘버르 받았을 때 내 수값이 넘버보다 작으면 이 구문 실행
        int n = stack.pop(); //팝을 해버림
        if (n > su) { // 배열이 수를 넘으면 에러 출력
          System.out.println("NO");
          break;
        } 
        else { // 수보다 작으면 - 어팬드하고 
          bf.append("-\n");
        }
      }
    }
      System.out.println(bf.toString()); //출력
  }
}
