import java.io.*;

public class Main {
    static int[] tri;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        tri = new int[45];
        for(int i = 1; i < 45; i++) {
            tri[i] = i * (i + 1) / 2;
        }

        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            sb.append(isTri(K)).append('\n');
        }
        System.out.println(sb.toString().trim());
    }
    
    public static int isTri(int K){
        for(int a = 1; a < 45; a++){
            for(int b = 1; b < 45; b++){
                for(int c = 1; c < 45; c++){
                    if(K == tri[a] + tri[b] + tri[c]){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}