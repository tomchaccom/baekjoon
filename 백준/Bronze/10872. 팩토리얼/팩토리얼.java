import java.util.*;

public class Main{
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int answer = 1;
        
        for(int i = n; i > 1; i--){
            answer *= i;
        }
        System.out.println(answer);
        
    }
    

}