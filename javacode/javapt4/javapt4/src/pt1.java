import java.util.*;
public class pt1 {
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);

        IntStack s=new IntStack(64);

        while(true){
        System.out.println();
        System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.capacity());
        System.out.print("(1)푸시 (2)팝 (3)피크 (4)클리어 (5)덤프 (6)사이즈 (7)다찼는지 (8)비었는지 (9)찾을 데이터 (0) 끝내기: ");
        int x=stdIn.nextInt();

        if(x==0)
        break;

        int y;
        switch(x){
            case 1:
            System.out.print("데이터 : ");
            y=stdIn.nextInt();
            try{
                s.push(y);
            }catch(IntStack.OverflowIntStackException e){
                System.out.println("스택이 가득참");
            }
            break;

            case 2:
            System.out.print("데이터 : ");
            try{
                y=s.pop();
                System.out.println("팝한 데이터는"+y+"입니다.");
            }catch(IntStack.EmptyIntStackException e){
                System.out.println("스택이 비어있음");
            }
            break;

            case 3:
            try{
                y= s.peek();
                System.out.println("피크한 데이터는"+y+"입니다.");
            }catch(IntStack.OverflowIntStackException e){
                System.out.println("스택이 비어있음");
            }
            break;

            case 4:
            try{
                s.clear();
            }catch(IntStack.EmptyIntStackException e){
                System.out.println("스택이 이미 비어있음");
            }
            break;

            case 5:
            try{
                s.dump();
            }catch(IntStack.EmptyIntStackException e){
                System.out.println("스택이 비어있음");
            }
            break;

            case 6:
            try{
                System.out.println(s.size());
            }catch(IntStack.EmptyIntStackException e){
                System.out.println("스택이 비어있음");
            }
            break;

            case 7:
                System.out.println(s.isEmpty());
            break;

            case 8:
                System.out.println(s.isFull());
            break;

            case 9:
            System.out.print("찾을 데이터 입력 : ");
            int k=stdIn.nextInt();
            int p=s.indexOf(k);
            System.out.println("찾은 데이터는 stk["+p+"]에 있음");
        }
    }
}
}
