import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0,0,0,0};
        
        Arrays.sort(num_list);
        
        for(int i = 0; i < 5; i++){
            answer[i] = num_list[i];
        }
        
        
        return answer;
    }
}