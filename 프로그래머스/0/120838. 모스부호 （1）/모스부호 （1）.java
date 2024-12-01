import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] letterArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        String[] buho = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String alph : letterArr){
            for(int i = 0; i < buho.length; i++){
                if(alph.equals(buho[i])){
                    sb.append((char)(i + 'a'));
                    break;
                }   
            }
        }
        return sb.toString();
    }
}