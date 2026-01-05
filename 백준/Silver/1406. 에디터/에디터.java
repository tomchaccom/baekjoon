import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열 입력
        char [] arr = br.readLine().toCharArray();
        // 명령어 케이스 수
        int cases = Integer.parseInt(br.readLine());

        List<Character> editer = new LinkedList<>();



        for(char c : arr){
            editer.add(c);
        }

        ListIterator<Character> it = editer.listIterator(editer.size());


        for(int i = 0; i < cases; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.equals("L") && it.hasPrevious()){
                it.previous();
            }
            else if(s.equals("D") && it.hasNext()){
                it.next();
            }
            else if(s.equals("B") && it.hasPrevious()){
                it.previous();
                it.remove();
            }
            else if(s.equals("P")){
                char t= st.nextToken().charAt(0); // 오 신기
                it.add(t);

            }

        }
        for(char c : editer){
            bw.write(c);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
