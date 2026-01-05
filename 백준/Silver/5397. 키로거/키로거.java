import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        List<Character> keyLogger = new LinkedList<>();

        ListIterator<Character> it;

        for (int i = 0; i < test; i++) {

            char [] arr = br.readLine().toCharArray();
            it = keyLogger.listIterator();

            for(char c : arr){

                if(c == '<'){
                    if(it.hasPrevious()){
                        it.previous();
                    }
                }else if(c == '>'){
                    if(it.hasNext()){
                        it.next();
                    }
                }else if(c == '-'){
                    if(it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                }else{
                    it.add(c);
                }


            }
            bw.write(keyLogger.toString()
                    .replace("[" ,"")
                    .replace("]","\n")
                    .replace("," ,"")
                    .replace(" ","")
            );
            keyLogger.clear();


        }
        bw.flush();
        bw.close();

    }


}




