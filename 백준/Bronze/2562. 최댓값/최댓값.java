import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 리스트에 넣고, 배열 값이랑 비교해가면서 반복문으로 꺼내기?

        int max = -1;
        int idx = 0;
        List<Integer> num = new ArrayList<>();

        for(int j = 0; j <9; j++){

            int x = Integer.parseInt(br.readLine());
            max = Math.max(max, x);
            num.add(x);

        }

        for(int i = 0; i < num.toArray().length; i++){
            if(num.get(i) == max){
                idx = i + 1;
                break;
            }

        }

        System.out.println(max);
        System.out.println(idx);
    }
}

