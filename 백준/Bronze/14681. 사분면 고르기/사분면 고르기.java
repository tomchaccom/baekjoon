import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        int a;
        int b;
        
        Scanner t = new Scanner(System.in);
        
        a = t.nextInt();
        b = t.nextInt();
        
        if(a > 0 && b > 0)
            System.out.print("1");
        else if(a < 0 && b > 0)
            System.out.print("2");
        else if(a < 0 && b < 0)
            System.out.print("3");
        else
            System.out.print("4");
        
        t.close();
        
        
        
        
    }
    
    
    
    
    
}