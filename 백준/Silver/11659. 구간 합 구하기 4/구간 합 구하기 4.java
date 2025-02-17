
import java.io.*;
import java.util.*;

public class Main{

     public static void main(String[] args) throws IOException {


          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

          String line1 = br.readLine();
          StringTokenizer str1 = new StringTokenizer(line1, " ");
          int n = Integer.parseInt(str1.nextToken());
          int m = Integer.parseInt(str1.nextToken());

          int a []  = new int[n+1]; //0을 제외한 인덱스로 편하게 접근하기 위함
          int s [] = new int[n + 1];
          String line2 = br.readLine();
          StringTokenizer str2 = new StringTokenizer(line2, " ");

          for(int k = 1; k < a.length ; k++){
               a[k] = Integer.parseInt(str2.nextToken());
               s[k] = s[k-1] + a[k];
          }

          for(int t = 0; t < m; t++){
               String lines = br.readLine();
               StringTokenizer str3 = new StringTokenizer(lines, " ");

               int i = Integer.parseInt(str3.nextToken());
               int j = Integer.parseInt(str3.nextToken());

               String result = String.valueOf(s[j] - s[i-1]);
               bw.write(result + " \n");

          }
          bw.flush();
          bw.close();
          br.close();




     }


}



