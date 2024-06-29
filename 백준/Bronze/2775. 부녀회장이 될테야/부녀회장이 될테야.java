import java.util.Scanner;

class Count{
   
    public int living(int k, int n){
        
        int live[][] = new int [k+1][n+1];
        
        for(int i = 1; i <= n; i++){
            live[0][i] = i;
        }
        
        for(int j = 1; j <= k; j++){
            for(int x = 1; x <= n; x ++){
                if(x != 1){
                    live[j][x] = live[j][x-1] + live[j-1][x];
                }
                else{
                    live[j][x] = 1;
                }
                
            }
        }
        
         return live[k][n];
        
    }
    
}

public class Main{
    public static void main(String [] args){
        
        Scanner t = new Scanner(System.in);
        
        int test,k,n,result;
        test = t.nextInt();
        
        Count count = new Count();
        
        for(int i = 0;i < test; i++){
            k = t.nextInt();
            n = t.nextInt();
            result = count.living(k,n);
            System.out.println(result);
        }
        
        t.close();
    
    
    }


}