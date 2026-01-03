import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 1 ; i <= n ; i++){

            for(int j = 0; j<(n - count) ; j++){
                System.out.print("*");
            }
            count++;
            System.out.println();

        }

    }
}

