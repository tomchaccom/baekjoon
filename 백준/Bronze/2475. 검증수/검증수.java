import java.util.Scanner;

public class Main{

    public static void main(String[] args){
    
        int a,b,c,d,e;
        int number;
        
        Scanner t = new Scanner(System.in);
        
        a = t.nextInt(); b = t.nextInt(); c = t.nextInt();d = t.nextInt(); e = t.nextInt();
        
        number = (a*a + b*b + c*c + d*d + e*e) % 10;
        
        System.out.print(number);
        
        t.close();
    
    }


}