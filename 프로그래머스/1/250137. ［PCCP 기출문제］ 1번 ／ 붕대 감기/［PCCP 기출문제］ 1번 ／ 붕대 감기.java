class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int attackCnt = attacks.length;
        
        answer -= attacks[0][1];
        if(answer < 0) return -1;
        // System.out.println(attacks[0][0] + "초 후 남은 피: " + answer);
        if(attackCnt > 1){
            for (int i = 1; i < attackCnt; i++) {
                int attackGap = attacks[i][0] - attacks[i-1][0] - 1;
                if(attackGap > 0){
                    int yCnt = attackGap / bandage[0];
                    answer += attackGap * bandage[1] + yCnt * bandage[2]; 
                    if(answer > health) answer = health;
                }
                // System.out.println(attacks[i][0]+"초 후 회복 : " + answer);
                answer -= attacks[i][1];
                if(answer <= 0) return -1;
                // System.out.println(attacks[i][0]+"초 후 공격 : " + answer);
            }
        }
        return answer;
    }
}