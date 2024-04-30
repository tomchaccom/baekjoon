import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        String c;
        int n;
        
        Scanner s = new Scanner(System.in);
        
        c = s.nextLine();
        n = s.nextInt();
        
        
        System.out.print(c.charAt(n -1));
        
        s.close();
        
        
    }
    
}