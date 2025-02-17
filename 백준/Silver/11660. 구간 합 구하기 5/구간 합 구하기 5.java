
import java.io.*;
import java.util.*;

public class Main{
     public static void main(String []args) throws IOException{

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


          StringTokenizer s1 = new StringTokenizer(br.readLine()," ");

          int n = Integer.parseInt(s1.nextToken());
          int m = Integer.parseInt(s1.nextToken());

          int [][] arr = new int[n+1][n+1];
          int [][] sum = new int[n+1][n+1];

          for(int k = 1; k < n+1; k++){
               StringTokenizer str = new StringTokenizer(br.readLine()," ");
               for(int t = 1; t < n+1; t++){
                    arr[k][t] = Integer.parseInt(str.nextToken());

               }

          }
          for(int k = 1; k < n+1; k++){
               for(int t = 1; t < n+1; t++){
                    sum[k][t] = sum[k][t-1] + sum[k-1][t]- sum[k-1][t-1] + arr[k][t];

               }

          }


          for(int i = 0; i < m; i++){
               StringTokenizer xy = new StringTokenizer(br.readLine()," ");
               int x1 = Integer.parseInt(xy.nextToken());
               int y1 = Integer.parseInt(xy.nextToken());
               int x2 = Integer.parseInt(xy.nextToken());
               int y2 = Integer.parseInt(xy.nextToken());
               int result = sum[x2][y2]- sum[x1 - 1][y2] - sum[x2][y1-1] + sum[x1-1][y1 -1];
               bw.write(String.valueOf(result) + "\n");

          }
          bw.flush();
          bw.close();
          br.close();

     }


}







