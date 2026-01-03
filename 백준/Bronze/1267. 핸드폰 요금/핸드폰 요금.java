import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] call = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i < n; i++){
            call[i] = Integer.parseInt(st.nextToken());
        }

        int M = 0;
        int Y = 0;

        for(int j = 0; j < n; j++){

            if((call[j] / 60) == 0){
                M += 15;
            }
            else{
                M += ((call[j] / 60) + 1) * 15;
            }

            if((call[j] / 30) == 0){
                Y += 10;
            }else{
                Y += ((call[j] / 30) + 1) * 10;
            }


        }

        if(Y == M){
            System.out.println("Y M " +M);
        }

        if (Y > M ) {
            System.out.println("M "+ M );

        }

        if (Y < M){
            System.out.println("Y "+ Y);
        }

    }

}