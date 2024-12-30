import java.io.*;
import java.util.*;

public class Main{

    public static void main(String []args)  throws IOException{

        int a;
        int b;
        int c;
        int count;
        int div;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        String [] arr = br.readLine().split(" ");

        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[1]);
        c = Integer.parseInt(arr[2]);

        div = a-b;

        // 일단 동시에 입력을 세개

        // a 하루에 올라가는 양 b 밤에 미끄러짐 c 최종 목표
        // 2 1 5 4
        // 5 1 6 2
        // 100 99 1000000000 999999901

        c -= a; // 마지막 연산의 횟수를 빼줌

        count = (int)(Math.ceil(((double)c/(double)div))) + 1; // 2 1 3

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }

}