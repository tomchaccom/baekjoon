
import java.util.*;

public class Main{

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int [] scores = new int[n];

          for (int i = 0; i < n; i++) {
               scores[i] = sc.nextInt();
          }

          double sum = 0;
          int max = 0;
          double result;

          for (int i = 1; i < n; i++) {
               if(scores[i] >= scores[max]) {
                    max = i;
               }
          }

          for(int num : scores){
               sum += num;
          }

          result = sum*100/scores[max]/n;

     
         System.out.println(result);



     }


}



