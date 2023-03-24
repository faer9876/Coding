import java.util.*;
public class t1{
  static int solution(int num[], int num_len){
    int answer = 0;
    num_len=num.length;
    for(int i=0; i<num_len-2; i++){
      for(int j=i+1; j<num_len-1; j++){
        for(int k=j+1; k<num_len; k++){
          if(num[i]+num[j]+num[k]==0)
          answer+=1;
        }
      }
    }
    return answer;
  }
  public static void main(String[] args){
    Scanner stdin=new Scanner(System.in);
    int[] num=new int[5];
    int p=num.length;

    for(int i=0;i<p;i++){
      System.out.print("input : ");
      num[i]=stdin.nextInt();
  }
  System.out.println("output :"+solution(num,p));
}
};