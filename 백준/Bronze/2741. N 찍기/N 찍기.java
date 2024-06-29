import java.util.Scanner;


public class Main{
    public static void main(String [] args){
        Scanner t = new Scanner(System.in);
    
        int count; 
        count = t.nextInt();
    
        for(int i = 1; i <= count; i++){
        System.out.println(i);
        }
        t.close();
        }
}