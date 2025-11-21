import java.io.*;
import java.util.*;

// 리스트를 입력하고 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 먼저 줄 수를 입력받는다

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            
            for (int j= 0; j < input[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(input[0]); k++) {
                    sb.append(input[1].charAt(j));
                }
            }
           bw.write(sb + "\n") ;
        }
        bw.flush();
    }
}