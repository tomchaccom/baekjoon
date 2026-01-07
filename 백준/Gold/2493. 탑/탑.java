import java.util.*;
import java.io.*;

public class Main{

    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque <Tower> top = new ArrayDeque<>();

        // 탑의 갯수
        int n = Integer.parseInt(br.readLine());
        int num;
        int x;

        // 탑입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i<= n; i++){
            num = Integer.parseInt(st.nextToken());

            if(top.isEmpty()) {
                Tower tower = new Tower(i, num);
                top.push(tower);
                bw.write(0 + " ");
                continue;
            }

            while(!top.isEmpty() && top.peek().height < num){
                top.pop();
            }
            if(top.isEmpty()){
                bw.write(0 + " ");
            }else{
                bw.write(top.peek().idx + " ");
            }
            Tower tower = new Tower(i,num);
            top.push(tower);


        }

        bw.flush();
    }
}
class Tower{
    int idx;
    int height;

    public Tower(int idx, int height){
        this.idx = idx;
        this.height = height;
    }

}