import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Map<Character, Integer> base = new HashMap<>();
        Map<Character, Integer> strfry = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            base.clear();
            strfry.clear();

            // str1 빈도 카운트
            for (char c : str1.toCharArray()) {
                base.put(c, base.getOrDefault(c, 0) + 1);
            }

            // str2 빈도 카운트
            for (char c : str2.toCharArray()) {
                strfry.put(c, strfry.getOrDefault(c, 0) + 1);
            }

            // 두 Map이 완전히 같으면 Possible
            if (base.equals(strfry)) {
                sb.append("Possible\n");
            } else {
                sb.append("Impossible\n");
            }
        }

        System.out.print(sb.toString());
    }
}
