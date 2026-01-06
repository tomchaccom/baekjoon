import java.util.*;
import java.io.*;

public class Main{
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(br.readLine());
        int num;
        int sum= 0;
        int x;

        for(int i =0; i < k; i++){
            num = Integer.parseInt(br.readLine());

            if(num != 0){
                stack.add(num);
                sum += num;
            }else{
                x = stack.pop();
                sum -= x;
            }

        }

        System.out.println(sum);

    }
}