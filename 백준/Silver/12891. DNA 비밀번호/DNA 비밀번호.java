import java.io.*;
import java.util.*;

public class Main {

     public static void main(String [] args) throws IOException {

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

          StringTokenizer st = new StringTokenizer(br.readLine());
          int n = Integer.parseInt(st.nextToken());
          int m = Integer.parseInt(st.nextToken());

          char [] str = br.readLine().toCharArray();

          StringTokenizer st2 = new StringTokenizer(br.readLine());

          int[] ans = new int[4];

          for (int i = 0; i < 4; i++) {
               ans[i] = Integer.parseInt(st2.nextToken());
          }

          int[] arr = {0,0,0,0}; // acgt


          int end = m;
          int count = 0;

          for(int i = 0; i < end; i++) {

               switch(str[i]){

                    case 'A':  arr[0]++; break;
                    case 'C':  arr[1]++; break;
                    case 'G':  arr[2]++; break;
                    case 'T':  arr[3]++; break;
                    default:   break;

               }
          }

          if(arr[0] >= ans[0] && arr[1] >= ans[1] && arr[2] >= ans[2] && arr[3] >= ans[3]) {
               count++;
          }

          for(int start = 0; end < n; start++, end++) {

               switch (str[start]) {
                    case 'A':  arr[0]--; break;
                    case 'C':  arr[1]--; break;
                    case 'G':  arr[2]--; break;
                    case 'T':  arr[3]--; break;
                    default:   break;

               }
               switch (str[end]) {

                    case 'A':  arr[0]++; break;
                    case 'C':  arr[1]++; break;
                    case 'G':  arr[2]++; break;
                    case 'T':  arr[3]++; break;
                    default:   break;
               }
               if(arr[0] >= ans[0] && arr[1] >= ans[1] && arr[2] >= ans[2] && arr[3] >= ans[3]) {
                    count++;
               }

          }

          bw.write(count + "\n");
          bw.flush();
          bw.close();
          br.close();
     }
}




