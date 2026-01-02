import java.io.*;
import java.util.*;

public class Main{

    public static void main(String [] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());

        // 숫자를 배열에 넣고 정렬시켜 버릴까..?
        // 정렬하면.. 뭐가 좋지? 가장 큰수를 찾을때 말고는.. 딱히.. 
        // 저 같다라는 조건을 만족하기에 정렬이 좋을거 같은데 

        int [] arr = {one, two, three};
        
        Arrays.sort(arr);
        
        if(one == two && two == three){
            System.out.println(10000 + one * 1000);
        }else if(one == two) {
            System.out.println(1000 + one * 100);
        }else if(two == three){
            System.out.println(1000 + two * 100);
        }else if(three == one){
            System.out.println(1000 + three * 100);
        }else{
            System.out.println(arr[2] * 100);
        }
        

    }
}