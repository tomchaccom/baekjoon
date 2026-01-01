import java.util.*;

public class Main{
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int score = sc.nextInt();
        
        if( 90 <= score && score<= 100){
            sb.append("A");
        }else if( 80 <= score && score <= 89){
            sb.append("B");
        }else if( 70 <= score && score <= 79){
            sb.append("C");
        }else if( 60 <= score && score <= 69){
            sb.append("D");
        }else{
            sb.append("F");
        }

        System.out.println(sb.toString());
        
        
        sc.close();
    }
    
}