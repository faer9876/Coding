public class test {
    public static void main(String[] args){
        int[] a=new int[100];
        int[] b=new int[100];
        int n=5;

        int ptr=5;
        a[1]=3;
        a[2]=4;
        a[3]=5;
        b[1]=2;
        b[2]=6;
        b[3]=9;
int k=0;
        do{
            k++;
        int x=a[ptr];
        int y=b[ptr--];
        System.out.println(x);
        System.out.println(y);
        }while(k==3);
        
}
}
