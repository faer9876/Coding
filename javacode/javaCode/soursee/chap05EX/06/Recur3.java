// 연습5-6
// 메서드 recur3의 비재귀적 구현

import java.util.Scanner;

class Recur3 {

	//--- 메서드 recur의 비재귀적 구현 ---//
	static void recur3(int n) {
		int[] nstk = new int[100];
		int[] sstk = new int[100];
		int ptr = -1;
		int sw = 0;

		while (true) {
			if (n > 0) {
				ptr++;
				nstk[ptr] = n; //5 , 1. 5 nstk[0]=5 2. nstk[1]=5  
				sstk[ptr] = sw; //0, 1. 1 sstk[0]=0 2. sstk[1]=1

				if (sw == 0)
					n = n - 1;//만약 n=5면 n=4
				else if (sw == 1) {
					n = n - 2; //n=2
					sw = 0; //sw=0
				}
				continue; //if문 둘중 하나를 타고 넘어감
			}
			do {
				n  = nstk[ptr]; //
				sw = sstk[ptr--] + 1; //ptr에 저장된 값에 +1을 하고 주소를 -1함? sw=1이됨
                                      //sw1씩 증가
				if (sw == 2) {
					System.out.println(n); //sw2일때 출력
					if (ptr < 0) //sw=2이고 ptr<0일때 루프 탈출
						return;
				}
			} while (sw == 2);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int   x = stdIn.nextInt();

		recur3(x);
	}
}

