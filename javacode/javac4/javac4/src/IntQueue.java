public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntArrayQueueException extends RuntimeException{
        public EmptyIntArrayQueueException(){}
    }
    public class OverflowIntArrayQueueException extends RuntimeException{
        public OverflowIntArrayQueueException() {}
    }

    public intQueue(int capacity){
        num=front=rear=0;
        max=capacity;
        try{
            que=new int[num];
        }catch(OutOfMemoryError e){
            max=0;
        }
    }
    public int enqueue(int x) throws OverflowIntArrayQueueException{
        if(num>=max)
        throw new OverflowIntArrayQueueException();
        que[rear++]=x;
        num++;
        if(rear==max)
        rear=0;
        return x;
    }
    public int deque() throws EmptyIntArrayQueueException{
        if(num<=0)
        throw new EmptyIntArrayQueueException();
        int x=que[front++];
        num--;
        if(front==max)
        front =0;
        return x;
    }
    public int peek() throws EmptyIntArrayQueueException{
        if(num<=0)
        throw new EmptyIntArrayQueueException();
        return que[front];
    }
    public int indexOf(int x){
        for(int i=0; i<num; i++){
            int idx=(i+front)%max;
            if(que[idx]==x)
            return idx;
        }
        return -1;
    }
}
