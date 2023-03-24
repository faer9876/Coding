public class IntStack {
    int max; //스택 용량
    int ptr; //스택 포인터
    int[] stk; //스택 본체

    //스택이 비어있는 예외
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    //스택이 가득 차 있는 예외
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    //스택본체 생성
    public IntStack(int capacity){
        ptr=0;
        max=capacity;
        try{
            stk=new int[max];  //스택 본체에 배열을 생성
        }catch(OutOfMemoryError e){
            max=0;  //가득차서 배열을 생성할 수 없음
        }
    }

    //푸쉬 메서드 생성 
    public int push(int x) throws OverflowIntStackException{
        if(ptr>=max)             //ptr이 max보다 크면 예외로 던짐
        throw new OverflowIntStackException();
        return stk[ptr++]=x;     //ptr에 저장시키고 1증가해서 마지막 값을 반환
    }

    //pop 메서드 생성
    public int pop() throws EmptyIntStackException{
        if(ptr<=0)
        throw new EmptyIntStackException();
        return stk[--ptr];       //ptr 1을 빼고 저장시킨후 마지막 값을 반환
    } 

    //peek 메서드 생성
    public int peek() throws EmptyIntStackException{
        if(ptr<=0)
        throw new EmptyIntStackException(); //스택이 비어있으면 안됨
        return stk[ptr-1]; //꼭대기 요소 반환
    }

    //indexOf(검색) 메서드 생성
    public int indexOf(int x){
        for(int i=ptr-1;i>=0;i--) //정상에서 선형검색
        if(stk[i]==x)
        return i;   //검색 성공
        return -1;  //검색 실패
    }

    //clear(스택을 초기화) 메서드 생성
    public void clear(){
        ptr=0;
    }

    //스택 용량 표현 메서드 생성
    public int capacity(){
        return max;
    }

    //데이터 수 반환 메서드 생성
    public int size(){
        return ptr;
    }

    //스택이 비어있는지 확인하는 메서드 생성
    public boolean isEmpty(){
        return ptr <=0 ;
    }

    //가득 차 있는지 확인하는 메서드 생성
    public boolean isFull(){
        return ptr>=max;
    }

    //스택의 모든 데이터 수를 반환하는 메서드 생성
    public void dump(){
        if(ptr<=0)
        System.out.print("스택이 비어 있음 ");
        for(int i=0;i<ptr;i++)
        System.out.print(stk[i]+" ");
        System.out.println();
    }
}
