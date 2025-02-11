import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args) throws IOException {

        List <String> list = new ArrayList<>();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out));

        int count;

        count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            list.add(br.readLine());
        }

        List<String> list2 = list.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        for(String s : list2){
            bw1.write(s + "\n");
        }

        bw1.flush();
        bw1.close();
        br.close();





    }

}
