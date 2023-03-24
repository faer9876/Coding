import java.util.*;
public class Int2DArray {
    public static void main(String[] args){
        int[][] x=new int[2][4]; //배열 00부터 24까지

        x[0][1]=37;
        x[0][3]=54;
        x[1][2]=65;

        for(int i=0; i<2; i++) //다차원 배열의 00부터 13까지 출력
        for(int j=0;j<4;j++)
        System.out.println("x["+i+"]["+j+"]="+x[i][j]);
    }
}
