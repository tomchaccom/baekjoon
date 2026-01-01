import java.io.*;
import java.util.*;

public class Main{

    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int sum = 0;

        for(int i =0; i<2; i++){
            sum = sum + Integer.parseInt(st1.nextToken());

        }
        System.out.println(sum);

    }

}