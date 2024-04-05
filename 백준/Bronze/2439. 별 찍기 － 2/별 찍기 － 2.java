import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        int i,j,k,n;
        
        Scanner t = new Scanner(System.in);
        
        n = t.nextInt();
        
        for(i = 1; i < n + 1; i++){
            for(j = n - i; j > 0; j--)
                System.out.print(" ");
            for(k = i; k > 0; k--)
                System.out.print("*");
            System.out.println("");
            
        }
        
        t.close();
        
        
        
        
    }
    
    
}