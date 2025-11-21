import java.io.*;
import java.util.*;

// 리스트를 입력하고 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 먼저 줄 수를 입력받는다

        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine(); // 한줄 입력

            stack.push(Integer.parseInt(s)); // 입력하고

            if (stack.peek() == 0){
                stack.pop(); // 0제거
                stack.pop(); // 그 앞 수도 제거
            }
        }
        for (int j= 0; j < stack.size(); j++) {
            sum += stack.get(j);
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}