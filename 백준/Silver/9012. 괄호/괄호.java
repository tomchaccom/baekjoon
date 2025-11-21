import java.io.*;
import java.util.*;

// 리스트를 입력하고 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 횟수 입력
        String [] s1 = new String[n];
        int count;

        for (int i = 0; i < n; i++) {
            s1[i] = br.readLine();
            count = 0;

            for (char c : s1[i].toCharArray()) {
                if (c == '(') {
                    count = count + 1;
                }
                if(c == ')') {
                    count = count -1;
                }
                if (count < 0) {
                    break;
                }
            }
            if (count == 0) {
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }

        bw.flush();


    }
}