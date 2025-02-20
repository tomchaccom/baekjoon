import java.io.*;
import java.util.*;

public class Main{

     // 1940

     public static void main(String [] args) throws IOException{

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

          int n = Integer.parseInt(br.readLine()); // 재료의 갯수
          int m = Integer.parseInt(br.readLine());  // 고유 번호

          int [] armor = new int [n];
          StringTokenizer line = new StringTokenizer(br.readLine());

          for(int i = 0; i < n;i++){
               armor[i] = Integer.parseInt(line.nextToken());

          }

          Arrays.sort(armor); // 정렬했으니까 작은 거 부터 빼면서

          int i = 0;
          int j = n-1;
          int count = 0;
          int asum = 0;


          while(i < j){

               asum = armor[i] + armor[j];

               if(asum > m){
                    j--;
               }else if(asum == m){
                    count++;
                    i++;
                    j--;
               }else{
                    i++;
               }


          }

          bw.write(count + "\n");
          bw.flush();
          bw.close();
          br.close();






     }
}