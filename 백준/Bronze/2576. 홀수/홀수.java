import java.io.*;
import java.util.*;

public class Main{

    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        List<Integer> numbers = new ArrayList<>();

        for(int i =0; i < 7; i ++ ){
            int x = Integer.parseInt(br.readLine());

            if (x % 2 != 0){
                sum += x;
                numbers.add(x);
            }


        }
        numbers.sort(Comparator.naturalOrder());


        if(sum == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(numbers.get(0));
        }



    }
}