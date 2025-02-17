
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{

     public static void main(String[] args) {


          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); // 수의 갯수 배열의 길이
          int m = sc.nextInt(); // 입력받는 합의 수
          int i;
          int j;

          int arr [] = new int[n];
          int sum [] = new int[n];

          for(i=0;i<n;i++){
               arr[i] = sc.nextInt();

               if(i==0)
                    sum[i] = arr[i];
               else
                    sum[i] = sum[i-1] + arr[i];
          }


          for(int k = 0;k<m;k++){
               i = sc.nextInt();
               j = sc.nextInt();
               int result;
               if(i ==1)
                    result = sum[j-1];
               else
                    result = sum[j-1] - sum[i-2];
               System.out.println(result);
          }



     }


}



