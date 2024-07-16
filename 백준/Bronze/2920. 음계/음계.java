import java.util.Scanner;

public class Main{
    
    public static void main(String []args){
       
        int count = 0;
       int music [] = new int [8];
       Scanner t = new Scanner(System.in);

       for(int i = 0; i < music.length; i++){
            music[i] = t.nextInt();
       }
        
       for(int k = 0; k < music.length; k++){
            if(music[k] == k + 1){
                count ++;
            }
            else if(music[k] == 8-k){
                count --;
            }      

       }

       if(count == 8){
        System.out.println("ascending");
       }
       else if(count == -8){
        System.out.println("descending");
       }
       else{
        System.out.println("mixed");
       }

       t.close();

    }
}