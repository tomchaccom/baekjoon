

import java.util.Scanner;


public class Main{

    public static void main(String []args){
        Scanner t = new Scanner(System.in);

        int test, floor, room; 
        int h,w,n,result;

        test = t.nextInt();

        for(int i = 0; i< test; i++){
            
            h = t.nextInt();
            w = t.nextInt();
            n = t.nextInt();

            floor = n % h;
            if(floor == 0)
                floor =h;

            room = (n-1)/h +1;

            result = floor *100 + room;

            System.out.println(result);



        }


        t.close();

    }
}