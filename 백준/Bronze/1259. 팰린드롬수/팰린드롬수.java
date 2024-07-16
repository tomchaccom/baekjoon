import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    
    public static void main(String []args){
       
       Scanner scanner = new Scanner(System.in);
       List<String> inputs = new ArrayList<>();
       List<String> results = new ArrayList<>();
       
       String input;
       
       // 입력을 받아 리스트에 저장
       while (true) {
           input = scanner.next();
           if (input.equals("0")) {
               break;
           }
           inputs.add(input);
       }
       
       // 입력 리스트를 처리하고 결과 리스트에 저장
       for (String fal : inputs) {
           StringBuffer str = new StringBuffer(fal);
           str.reverse();
           
           if (fal.equals(str.toString())) {
               results.add("yes");
           } else {
               results.add("no");
           }
       }
       
       // 결과 리스트 출력
       for (String result : results) {
           System.out.println(result);
       }
       
       scanner.close();
    }
}
