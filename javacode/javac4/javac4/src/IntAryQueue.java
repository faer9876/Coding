public class IntAryQueue {
    private int capacity;
    private int num;
    private int[] que;

    public static class EmptyQueueException extends RuntimeException{
        public EmptyQueueException(){}
    }

    public static class OverflowQueueException extends RuntimeException{
        public OverflowQueueException(){}
    }

    public IntAryQueue(int max){
        num=0;
        capacity=max;
        try{
            que=new int[capacity];
        }catch(OutOfMemoryError e){
            max=0;
        }
    }

    public int inqueue(int x) throws OverflowQueueException {
        if(num>=capacity)
        throw new OverflowQueueException();
        que[num++]=x;
        return x;
    }

    public int dequeue() throws EmptyQueueException{
        if(num<=0)
        throw new EmptyQueueException();
        int x=que[0];
        for(int i=0;i<num-1;i++)
        que[i]=que[i+1];
        num--;
        return x;
    }

    public int peek() throws EmptyQueueException{
        if(num<=0)
        throw new EmptyQueueException();
        return que[num-1];
    }

    public int size() throws EmptyQueueException{
        return num;
    }

    public int capacity() throws EmptyQueueException{
        return capacity;
    }
}
