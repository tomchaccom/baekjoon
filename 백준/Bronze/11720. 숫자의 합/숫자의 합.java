import java.util.Arrays;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String sNum = sc.next(); // nextLine 이랑 차이를 잘 모르겠네 공백을 받을 수 있나 없나 였던거 같은데
        char cNum [] = sNum.toCharArray();

        int sum = 0;

        for(int i = 0 ; i < n ; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);


    }

}

