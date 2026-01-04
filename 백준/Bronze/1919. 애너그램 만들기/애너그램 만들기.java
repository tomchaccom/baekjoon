import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char [] arr = br.readLine().toCharArray();
        char [] arr2 = br.readLine().toCharArray();

        Map<Character, Integer> aner1 = new HashMap<>();
        Map<Character, Integer> aner2 = new HashMap<>();
        int count = 0;

        for(char c : arr){
            aner1.put(c,aner1.getOrDefault(c,0) + 1);
        }
        for(char c : arr2){
            aner2.put(c,aner2.getOrDefault(c,0) + 1);
        }

        for(char c : aner1.keySet()){
            if(!aner1.get(c).equals(aner2.getOrDefault(c,0))){
                count += Math.abs(aner1.get(c) - aner2.getOrDefault(c,0));
            }

        }
        for(char c : aner2.keySet()){
            if(aner1.getOrDefault(c,0).equals(0)){
                count += aner2.get(c);
            }

        }



        System.out.println(count);

    }
}
