import java.util.Scanner;


public class Main{
    
    public static void main(String []args){
        
        String a,b;
        int c;
        int result;
        
        Scanner t = new Scanner(System.in);

        a = t.nextLine();
        b = t.nextLine();
        c = t.nextInt();

        result = Integer.parseInt(a) + Integer.parseInt(b) - c;
        System.out.println(result);

        // 문자로 변환한 후에 다시 ....

        a = a.concat(b);

        System.out.println(Integer.parseInt(a) -c);

        t.close();

        
    }
}