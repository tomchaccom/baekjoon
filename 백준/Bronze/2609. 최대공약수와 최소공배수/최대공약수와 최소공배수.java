// 최대 공약수 최소공배수 줄 구분해서 출력 

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int x,y; // 가 작은 수라고 가정
        int gcd = 0, lcm = 0;
        
        x = scanner.nextInt();
        y = scanner.nextInt();
        
        
        // 최대공약수
        for(int i = 1; i <= y; i++){
            if(x % i == 0 && y % i ==0 )
                gcd = i;
            
        }
        lcm = (x * y) / gcd;
        
        System.out.println(gcd);
        System.out.print(lcm);
        
        scanner.close();
        
        
    }
    
    
}