class Solution {
    public String solution(String[] id_pw, String[][] db) {
        boolean isFail = true;
        for(String[] acc : db){
            if(id_pw[0].equals(acc[0])) {
                isFail = false;
                if(id_pw[1].equals(acc[1])) return "login";
            }
        }
        if(isFail) return "fail";
        else return "wrong pw";
    }
}