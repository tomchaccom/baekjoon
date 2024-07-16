import java.util.Scanner;

public class Main{
    
    public static void main(String []args){
       
       Scanner t = new Scanner(System.in);

       int h,m;

       h = t.nextInt();
       m = t.nextInt();

       if(m >= 45){

        System.out.print(h + " " + (m -45));

       }
       else{
        if(h != 0){
            System.out.print((h-1) + " " + (60 + (m-45)));
        }
        else{
            System.out.print(23+ " " + (60 + (m-45)));
        }

       }
        
       
       t.close();

    }
}