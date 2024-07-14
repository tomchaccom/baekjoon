import java.util.Scanner;

public class Main{
    
    public static void main(String []args){
       
        int a,b,c;
        int res;
        int count [] = new int [10];
    
        Scanner t = new Scanner(System.in);

     
        a = t.nextInt();
        b = t.nextInt();
        c = t.nextInt();
        
        // 150 * 266 * 427 = 17037300
        res = a * b * c;
        while((res/1)>0){
            count[res % 10]++;
            res = res / 10;

        }

        for(int i = 0; i < count.length;i++){
            System.out.println(count[i]);
        }

        t.close();

    }
}