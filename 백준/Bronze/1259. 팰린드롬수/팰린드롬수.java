import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    
    public static void main(String []args){
       
       Scanner t = new Scanner(System.in);

       String fal;
       StringBuffer str = new StringBuffer();
       ArrayList<String> list= new ArrayList<>();

    
       do{
            fal = t.next();
            
            str.append(fal); 
            str.reverse();
        
            if(fal.equals(str.toString()) && !(fal.equals("0"))){
                list.add("yes");
            }
            else{
                if(!(fal.equals("0"))){
                    list.add("no");
                }
            }

            str.delete(0,fal.length());
          
            
            
       }while(Integer.parseInt(fal) != 0);

       for(String result:list){
        System.out.println(result);
       }

       t.close();

    }

   
}
