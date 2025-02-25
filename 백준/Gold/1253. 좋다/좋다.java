import java.util.*;


public class Main{
     public static void main(String [] args){

          Scanner scan = new Scanner(System.in);

          int n = scan.nextInt();
          int num [] = new int [n];

          for(int i = 0; i < n; i++){
               num[i] = scan.nextInt();
          }
          Arrays.sort(num);

          int s;
          int e;
          int sum;
          int count = 0;

          for(int k = 0; k < n; k++){

               sum = num[k];
               s = 0;
               e = n - 1;

               while(s < e){

                    if(s == k){
                         s++;
                         continue;

                    }
                    if( e == k){
                         e--;
                         continue;
                    }
                    if( sum > (num[s] + num[e]))
                         s++;
                    else if ( sum < (num[s] + num[e])){
                         e--;
                    }else if (sum == num[s] + num[e]){
                         count++;
                         break;
                    }
                   
               }

          }
          System.out.println(count);





     }
}