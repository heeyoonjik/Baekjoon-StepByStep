class Solution {
    public String solution(int age) {
        String answer = "";
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        if(age<10){
            answer += (char)(age+97);
        }else if(age<100){
            n1 = age/10;
            n2 = age%10;
            answer += (char)(n1+97);
            answer += (char)(n2+97);
        }else if(age<1000){
            n1 = age/100;
            n2 = (age%100)/10;
            n3 = age%10;
            answer += (char)(n1+97);
            answer += (char)(n2+97);
            answer += (char)(n3+97);
        }else{
            answer = "baaa";
        }
        return answer;
    }
}