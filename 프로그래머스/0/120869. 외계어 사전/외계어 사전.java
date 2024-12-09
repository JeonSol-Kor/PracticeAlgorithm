class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean[] check;
        boolean isDone = false;
        for(String d : dic){
            check = new boolean[spell.length];
            for(int i = 0; i < spell.length; i++){
                if(d.contains(spell[i])) check[i] = true;
            }
            for(int i = 0; i < spell.length; i++){
                if(!check[i]){ isDone = false; break;}
                else isDone = true;
            }
            if(isDone) return 1;
        }
        return 2;
    }
}