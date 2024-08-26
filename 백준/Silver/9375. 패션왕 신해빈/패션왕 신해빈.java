import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine().trim());
        
        for(int t = 0; t < T; t++){
            int n = Integer.parseInt(br.readLine().trim());
            HashMap<String, List<String>> clothes = new HashMap<>();
            int result = 1;
            for(int i = 0; i < n; i++){
                String[] line = br.readLine().trim().split(" ");
                if(clothes.containsKey(line[1])){
                    clothes.get(line[1]).add(line[0]);
                }else{
                    List<String> newList = new ArrayList<>();
                    newList.add(line[0]);
                    clothes.put(line[1], newList);
                }
            }
            for (Map.Entry<String, List<String>> entry : clothes.entrySet()) {
                List<String> values = entry.getValue();
                int valueCount = values.size();
                result *= (valueCount + 1);
            }
            bw.write(String.valueOf(result-1) + '\n');
        }

		bw.flush();
		bw.close();
		br.close();
	}
}