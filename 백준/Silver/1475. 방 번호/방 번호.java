import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char [] num = s.toCharArray();
        int [] count = new int[10];

        int set = 0;


        for(char c : num ){
            int idx = (int)c - '0';
            int now = count[idx];

            count[idx]++;

            if(idx == 6 || idx == 9){
                if(count[6] + count[9] > 2 * set){
                    set++;
                }

            }else if(now == set){
                set++;
            }
        }
        System.out.println(set);

    }
}

