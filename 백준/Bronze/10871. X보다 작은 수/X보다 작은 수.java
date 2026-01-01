import java.io.*;
import java.util.*;

public class Main{ // 3:28분 
    
    public static void main(String []args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        
        
        int [] arr = new int[n];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
         
        
        for(int i = 0; i < n ; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
            
            if(arr[i] < x){
                sb.append(arr[i]).append(" ");
            }
            
        }
        
        
        System.out.println(sb.toString());
    }
        
 
}