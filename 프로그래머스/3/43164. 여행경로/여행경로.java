import java.util.*;
class Solution {
    public String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for (String[] ticket : tickets) {
            graph.putIfAbsent(ticket[0], new PriorityQueue<>());
            graph.get(ticket[0]).offer(ticket[1]);
        }
        LinkedList<String> result = new LinkedList<>();
        dfs("ICN", graph, result);
        return result.toArray(new String[0]);
    }
    private void dfs(String current, Map<String, PriorityQueue<String>> graph, LinkedList<String> result){
        while(graph.containsKey(current) && !graph.get(current).isEmpty()){
            String next = graph.get(current).poll();
            dfs(next, graph, result);
        }
        result.addFirst(current);
    }
}