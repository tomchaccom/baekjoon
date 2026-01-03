
import java.io.*;
import java.util.*;


public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i< num.length; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int goal = Integer.parseInt(br.readLine());
        int count =0;

        Arrays.sort(num);

        int start = 0;
        int end = num.length -1;
        int mid;

        while(start < end){
            mid = num[start] + num[end];

            if(mid == goal){
                count++;
                start++;
                end--;
            }else if(mid > goal){
                end--;
            }else{
                start++;
            }

        }



        System.out.println(count);
    }


}

