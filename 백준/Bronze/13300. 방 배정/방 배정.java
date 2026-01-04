
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        Map<Integer, Integer> man = new HashMap<>();
        Map<Integer, Integer> woman = new HashMap<>();

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        int count = 0;
        int mans;
        int womans;

        for(int i =0; i< n; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st2.nextToken());
            int level = Integer.parseInt(st2.nextToken());

            if(sex == 0){
                woman.put(level, woman.getOrDefault(level, 0) + 1);
            }else{
                man.put(level, man.getOrDefault(level,0) + 1);
            }
        }
        for(int j = 1; j<= 6; j++){
            mans = man.getOrDefault(j,0);
            womans = woman.getOrDefault(j,0);

            if(mans % k != 0){
                count = count + (mans/ k) +1;
            }else{
                count = count + (mans/ k);
            }
            if(womans % k != 0){
                count = count + (womans/ k) +1;
            }else{
                count = count + (womans/ k);
            }
        }
        System.out.println(count);
    }


}

