import java.io.*;
import java.util.*;

public class Main{

    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] height = new int [9];
        int sum = 0;


        for(int i = 0; i < 9; i++){
            int ki = Integer.parseInt(br.readLine());
            height[i] = ki;
            sum += ki;
        }

        int two = sum - 100;

        int a = -1, b = -1;


        for(int j = 0; j < 8; j++){
            for(int k = j + 1; k < 9; k++){

                if((height[j] + height[k] == two) && j != k){
                    a = j;
                    b = k;
                    break;

                }

            }
            if(a != -1){
                break;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int e = 0; e < 9; e++){
            if (!(height[a] == height[e]) && !(height[b] == height[e])){
                result.add(height[e]);
            }


        }

        result.sort(Comparator.naturalOrder());

        for (int nan : result){
            System.out.println(nan);
        }

    }
}

