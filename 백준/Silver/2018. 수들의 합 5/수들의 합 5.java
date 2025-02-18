import java.util.*;

public class Main{

     public static void main(String [] args){

          Scanner scan = new Scanner(System.in);

          int n = scan.nextInt();

          int sum = 1; // 자기 자신은 제외한다고 생각하기
          int count = 1;

          int numbers[] = new int [n+1];

          for(int i = 1; i < n+1; i++){
               numbers[i] = i;

          }

          int start_index = 1;
          int end_index = 1;

          while(numbers[start_index] != n){

               if(sum < n ){
                    sum += numbers[++start_index];

               }else if( sum == n){
                    count++;
                    sum -= numbers[end_index];
                    end_index++;

               }else{
                    sum -= numbers[end_index];
                    end_index++;
               }


          }


          System.out.println(count);



     }
}