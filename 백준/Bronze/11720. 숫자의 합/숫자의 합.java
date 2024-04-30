import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        
        int number,sum = 0;
        String c;
        Scanner s = new Scanner(System.in);
        
        number = s.nextInt();
        c = s.next();
        
        for(int i =0 ; i < number; i++){
            sum += c.charAt(i) -'0';
            
        }
        
        System.out.print(sum);
        
        s.close();
        
    }
        
        
        
        
    
}