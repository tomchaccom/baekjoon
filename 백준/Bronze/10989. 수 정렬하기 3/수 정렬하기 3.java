import java.io.*;
import java.util.*;

// 리스트를 입력하고 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 먼저 줄 수를 입력받는다
        int [] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        for(int k : num){
            bw.write(k + "\n");
        }
        bw.flush();
    }
}