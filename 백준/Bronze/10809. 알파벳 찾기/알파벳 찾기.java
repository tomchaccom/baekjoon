import java.util.Scanner;

public class Main{
    
    public static void main(String []args){
       
        String str;
        int sort[] = new int [26];
        char index = 'a';

        Scanner t = new Scanner(System.in);

        str = t.next(); // 공백은 인정하지 않음

        for(int i = 0 ; i < 26; i++){
            for(int k = 0; k < str.length(); k++){
                if(str.charAt(k) == (index + i)){
                    sort[i] = k;
                    break;
                }else{
                    sort[i] = -1;
                }

            }
            System.out.print(sort[i] + " ");
        }
        
        t.close();

    }
}