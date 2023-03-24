import java.util.*;
public class queue1 {
    public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    IntAryQueue q=new IntAryQueue(12);
    
    while(true){
        System.out.println();
        System.out.printf("현재 데이터 개수: %d / %d\n", q.size(), q.capacity());
        System.out.print("(1) 인큐 (2)디큐 (3)피크 (0)종료 : ");
        int x=stdIn.nextInt();

        if(x==0)
        break;

        int y;

        switch(x){
            case 1:
            System.out.print("데이터 : ");
            y=stdIn.nextInt();
            try{
                q.inqueue(y);
            }catch(IntAryQueue.OverflowQueueException e){
                System.out.println("스택이 가득참");
            }
            break;

            case 2:
            try{
                y=q.dequeue();
                System.out.println("dequeue한 데이터는"+y);
            }catch(IntAryQueue.EmptyQueueException e){
                System.out.println("스택이 비었음");
            }
            break;

            case 3:
            try{
                y=q.peek();
                System.out.println("피크한 데이터는"+y);
            }catch(IntAryQueue.EmptyQueueException e){
                System.out.println("스택이 비었음");
            }
            break;

        }

    }
}
}

