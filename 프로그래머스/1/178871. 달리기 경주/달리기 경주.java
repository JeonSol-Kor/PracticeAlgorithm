import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수 이름과 등수를 저장할 Map
        Map<String, Integer> playerRank = new HashMap<>();

        // 초기 등수 설정
        for (int i = 0; i < players.length; i++) {
            playerRank.put(players[i], i + 1);
        }

        // 해설진이 부른 이름을 순서대로 확인하여 위치 변경
        for (String calling : callings) {
            int rank = playerRank.get(calling);
            if (rank > 1) {
                // 추월이 가능한 경우 위치 변경
                String temp = players[rank - 2];
                players[rank - 2] = calling;
                players[rank - 1] = temp;
                playerRank.put(calling, rank - 1);
                playerRank.put(temp, rank);
            }
        }

        return players;
    }
}
