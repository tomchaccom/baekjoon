
import java.io.*;
import java.util.*;


public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int want = Integer.parseInt(br.readLine());


        Map<Integer, Integer> count = new HashMap<>();

        int num;

        for(int i = 0; i < n ; i++){
            num = Integer.parseInt(st.nextToken());

            count.put(num,count.getOrDefault(num, 0) + 1);

            }

        if(count.get(want) != null){
            System.out.println(count.get(want));
        }else{
            System.out.println(0);
        }
    }


}

