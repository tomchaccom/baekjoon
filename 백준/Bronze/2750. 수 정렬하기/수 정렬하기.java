import java.util.Arrays;
import java.util.Scanner;

public class Main{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int [] list = new int[number];

        for(int i = 0;i < number;i++){
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        for(int i : list){
            System.out.println(i);
        }



    }

}

