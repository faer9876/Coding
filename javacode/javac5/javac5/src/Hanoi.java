//원반을 두가지 옮기는 종류만 구하고 recur로 반복하면 됨.
//원반을 두가지 옮기는 경우
/*
 * public static recur(int n(원판 수)), int a(기둥 2), int b(기둥 3){
 * 1을 2로 2를 3으로 1을 3으로
 * 모든 기둥의 합이 6이므로 시작 기둥,목표기둥이 어느 기둥이라도 중간은 6-a-b로 표현가능
 * 그룹 x,y가 있으면 x->2, y->3, x->3
 * move(n-1,x,y)
 * x->a(2번 기둥)로 y->b(3번 기둥)으로
 * 만약 원판이 3개
 * a,b는 1,3으로 고정
 * 1: 3,1,3 -> 2,1,2 -> 1,1,3(출력: 1번원판을 3번으로 이동)
 * 2: 2,1,2(출력: 2번원판을 2번으로 이동)
 * 3: 1,3,2(출력: 1번원판을 3번에서 2번으로 이동)
 * 4: 3,1,3(출력: 3번원판을 1번에서 3번으로 이동)
 * 5: 2,2,3 -> 1,2,1(출력: 1번원판을 2번에서 1번으로 이동)
 * 6: 2,2,3(출력: 2번원판을 2번에서 3번으로 이동)
 * 7: 1,1,3(출력: 1번원판을 1번에서 3번으로 이동)
 * 8: 종료
 * }
 */

import java.util.Scanner;

public class Hanoi {
    //no개의 원반을 x번 기둥에서 y번으로 옮김
    static void move(int no, int x, int y){
        if(no>1)
        move(no-1,x,6-x-y);

        //중간에 한번 걸려서 1번 더 실행한다고 생각.
        System.out.println("원반["+no+"]을"+x+"기둥에서"+y+"기둥으로 옮김.");

        if(no>1)
        move(no-1,6-x-y,y);
    }
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반 개수 : ");
        int n=stdIn.nextInt();

        move(n,1,3); //1번기둥의 n개의 원반을 3번 기둥을 옮김
    }
}
