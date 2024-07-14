import java.util.Scanner;

public class Main{
    
    public static void main(String []args){
       
        int count, sum;
        int test;
        String answer;

        Scanner t = new Scanner(System.in);

        test = t.nextInt();

        for(int i =0; i < test; i++){
            
                answer = t.next();
                count = 1;
                sum = 0;

            for(int k = 0; k < answer.length(); k++){
                if(answer.charAt(k) == 'O'){
                    sum = sum+ count;
                     count++;
                }else if(answer.charAt(k) == 'X')
                    count =1;

                
            }
            System.out.println(sum);

        }
        
        


       t.close();

        
    }
}