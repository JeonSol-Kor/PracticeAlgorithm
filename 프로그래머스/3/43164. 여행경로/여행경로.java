import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        // 티켓 정보를 그래프로 변환
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for (String[] ticket : tickets) {
            graph.putIfAbsent(ticket[0], new PriorityQueue<>());
            graph.get(ticket[0]).offer(ticket[1]);
        }

        // 결과 경로를 저장할 리스트
        LinkedList<String> result = new LinkedList<>();

        // DFS 호출
        dfs("ICN", graph, result);

        // 결과를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }

    private void dfs(String current, Map<String, PriorityQueue<String>> graph, LinkedList<String> result) {
        // 현재 위치에서 연결된 공항들을 탐색
        while (graph.containsKey(current) && !graph.get(current).isEmpty()) {
            String next = graph.get(current).poll();
            dfs(next, graph, result);
        }
        // 경로 추가 (역순으로 추가됨)
        result.addFirst(current);
    }
}
