import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner t  = new Scanner(System.in);
        
        int size;
        int max = 0,least = 0;
        
        size = t.nextInt();
        int a[] = new int [size];
        
     
        
        for(int i = 0; i < size; i++){
            a[i] = t.nextInt();
        }
        
        for(int j = 1; j < size; j++){
            if(a[max] <= a[j])
                max = j;
            if(a[least] >= a[j])
                least = j;
            
        }
        System.out.printf("%d %d",a[least],a[max]);
        
        t.close();
        
        
    }
    
    
    
    
}