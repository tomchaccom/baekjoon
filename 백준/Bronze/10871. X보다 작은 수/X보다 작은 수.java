import java.util.Scanner;

public class Main{
    
    public static void main(String [] args){
        
        int N,X; // 수열의 사이즈 N  X보다 작은 수를 수열에서 출력 
        
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        X = scanner.nextInt();
        
        int sequence [] = new int [N];
            
        for(int i = 0; i< sequence.length;i++){
            sequence[i] = scanner.nextInt();
            
        }
        
        for(int k = 0; k < sequence.length; k++){
            if(X > sequence[k]){
                System.out.print(sequence[k]+" ");
            }
            
        }
        scanner.close();
        
    }
    
}