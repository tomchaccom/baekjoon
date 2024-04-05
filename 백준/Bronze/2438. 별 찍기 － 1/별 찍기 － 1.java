import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        int n;
        int i;
        int j;
        
        Scanner t = new Scanner(System.in);
        
        n = t.nextInt();
        
        for(i = 1; i < n + 1; i++){
            for(j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
            
            
        }
        
        t.close();
        
        
    }
    
    
    
}