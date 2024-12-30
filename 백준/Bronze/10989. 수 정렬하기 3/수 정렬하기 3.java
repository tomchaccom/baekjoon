import java.io.*;
import java.util.*;

public class Main{

    public static void main(String []args)  throws IOException{

        int count; // 횟수


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        count = Integer.parseInt(br.readLine());

        int [] arr = new int[count];

        for(int i=0;i<count;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int num:arr){
            bw.write(num+"\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }

}