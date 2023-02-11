import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int [] answer = new int [emergency.length];
        int [] copy = new int [answer.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = emergency[i];
        }
        Arrays.sort(copy);
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length; j++){
              if(emergency[i] == copy[j]){
                    answer[i] = answer.length - j;
             }
        }
    }
        return answer;
    }
}