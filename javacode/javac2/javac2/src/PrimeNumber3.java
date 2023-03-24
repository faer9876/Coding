import java.util.*; //소수를 구할때 짝수는 불필요 제곱이 되는 수도 불필요**
public class PrimeNumber3 {
    public static void main(String[] args){
        int counter=0; //곱셈과 나눗셈의 횟수
        int ptr=0; // 찾은 소수의 개수
        int[] prime=new int[500]; // 찾은 소수들을 저장하는 배열

        prime[ptr++]=2;  //2는 소수로 고정 즉 첫번째 소수는 2
        prime[ptr++]=3;  // 3도 소수로 고정

        for(int n=5; n<1000; n+=2){ //짝수는 소수가 아니므로 무조건 홀수로 고정
            boolean flag=false;
            for(int i=1; prime[i]*prime[i]<=n;i++){
                counter +=2;
                if( n%prime[i]==0){ //홀수 n으로 나누어 떨어지면 소수가 아님
                    flag=true;  
                    break; //즉 더이상의 반복 불필요
                }
            }
            if(!flag){
                prime[ptr++] =n; //마지막 까지 나누어 떨어지지 않으면 소수로 prime에 저장
                counter++;
            }
        }
        for(int i=0;i<ptr;i++)
        System.out.println(prime[i]);

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : "+counter);
    }
}
