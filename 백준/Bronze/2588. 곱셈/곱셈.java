import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        int a;
        int b;
        
        Scanner t = new Scanner(System.in);
        
        a = t.nextInt();
        b = t.nextInt();
        
        System.out.println(a * (b % 10));
        System.out.println(a * ((b % 100)/10));
        System.out.println(a * (b / 100));
        System.out.println(a *b);
        
        t.close();
        
        
        
    }
    
    
    
    
}