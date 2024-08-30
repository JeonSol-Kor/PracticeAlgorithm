import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().trim().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] grid = new String[N];
        for (int i = 0; i < N; i++) {
            grid[i] = br.readLine().trim();
        }

        int side = 1;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                for(int size = 1; size + i < N && size + j < M; size++){
                    if (grid[i].charAt(j) == grid[i].charAt(j + size) &&
                        grid[i].charAt(j) == grid[i + size].charAt(j) &&
                        grid[i].charAt(j) == grid[i + size].charAt(j + size)) {
                        side = side > size + 1 ? side : size + 1;
                    }
                }
            }
        }
        System.out.println(side * side);
    }
}