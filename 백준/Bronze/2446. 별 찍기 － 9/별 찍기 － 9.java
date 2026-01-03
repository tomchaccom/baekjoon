import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = n ; i > 0 ; i--){

            for(int k = 0; k < count; k++){
                System.out.print(" ");

            }

            for(int j = 0; j < (2* i -1); j++){
                System.out.print("*");
            }

            count++;
            System.out.println();

        }

        int ecount = n-1;

        for(int e = 1  ; e < n ; e ++){

            for(int k = ecount - e; k > 0; k--){
                System.out.print(" ");
            }

            for(int j = 0; j < (2 * e) +1; j ++){
                System.out.print("*");
            }

            System.out.println();

        }

    }
}

