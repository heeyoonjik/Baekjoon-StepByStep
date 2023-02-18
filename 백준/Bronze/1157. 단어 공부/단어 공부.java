import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().toUpperCase();
        Map<Character,Integer> hm = new LinkedHashMap<>(26);//초기 용량(capacity)지정
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hm.get(c) == null){
                hm.put(c,1);
            }else {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        int max = 0, repeatNum = 0;
        char maxKey = 0;
        for(Character i : hm.keySet()){
            if(hm.get(i)>max){
                max= hm.get(i);
                maxKey = i;
            }
        }
        for(Character i : hm.keySet()){
            if(hm.get(i) == max){
                repeatNum++;
            }
        }
        if(repeatNum >= 2){
            bw.write("?");
        }else{
            bw.write(maxKey+"");
        }
        bw.flush();
        bw.close();
    }
}