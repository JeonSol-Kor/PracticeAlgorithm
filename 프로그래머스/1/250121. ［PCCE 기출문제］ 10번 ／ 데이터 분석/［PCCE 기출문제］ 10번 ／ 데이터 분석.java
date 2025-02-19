import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> col = new HashMap<>();
        col.put("code", 0);
        col.put("date", 1);
        col.put("maximum", 2);
        col.put("remain", 3);
        
        int extIdx = col.get(ext);
        int sortIdx = col.get(sort_by);
        
        List<int[]> dataArr = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if(data[i][extIdx] < val_ext) dataArr.add(data[i]);
        }
        
        int size = dataArr.size();
        int[][] answer = new int[size][4];
            
        for(int i = 0; i < size; i++){
            for(int j = 0; j < 4; j++){
                answer[i][j] = dataArr.get(i)[j];
            }
        }
        
        Arrays.sort(answer, (a, b) -> Integer.compare(a[sortIdx], b[sortIdx]));
        
        return answer;
    }
}