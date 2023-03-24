import java.io.BufferedReader;
import java.io.InputStream;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class e_pt3 {
    public static void main(String[] args)throws Exception {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(bf.readLine());
      StringTokenizer st=new StringTokenizer(bf.readLine());
      int[] a=new int[n];
      for(int i=0; i<a.length; i++){
        a[i]=Integer.parseInt(st.nextToken());
      }
      int temp;

      for(int ins=0;ins<a.length-1;ins++){
        for(int cmp=0;cmp<a.length-ins-1;cmp++){
          if(a[cmp]>a[cmp+1]){
            temp=a[cmp];
            a[cmp]=a[cmp+1];
            a[cmp+1]=temp;
          }
        }
      }
      for(int i=0;i<a.length;i++){
      System.out.print("["+a[i]+"]");
      }
  }
}
