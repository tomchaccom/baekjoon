import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        int a[] = new int[9];
        int max = 0;
        
        Scanner t = new Scanner(System.in);
        
        for(int i = 0; i < 9; i++){
            a[i] = t.nextInt();
            
        }
        for(int j = 1; j < 9; j++){
            if(a[max] <= a[j])
                max = j;
        }
        
        System.out.println(a[max]);
        System.out.print(max+1);
        
        t.close();
        
        
    }
    
    
    
}