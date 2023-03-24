public class Test3 {
    public static void main(String[] args){
        int[] a=new int[100];
        int ptr=-1;
        int t=0;
        while(t==2){
        ptr++;
        System.out.println(ptr);
        t=a[ptr--]+1;
        System.out.println(t);
        }
    }
}
