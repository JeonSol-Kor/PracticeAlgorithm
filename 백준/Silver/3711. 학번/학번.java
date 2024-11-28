import java.io.*;
import java.util.*;

public class Main {
    // 최대 학번 차이를 고려하여 SPF를 미리 계산합니다.
    static final int MAX = 1000001;
    static int[] spf = new int[MAX];

    // 최소 소인수 분해(SPF)를 미리 계산하는 함수
    static void computeSPF() {
        Arrays.fill(spf, 0);
        spf[0] = spf[1] = 1;
        for(int i=2; i<MAX; i++) {
            if(spf[i] == 0) {
                spf[i] = i;
                if((long)i * i >= MAX) continue;
                for(int j=i*i; j<MAX; j+=i){
                    if(spf[j] == 0){
                        spf[j] = i;
                    }
                }
            }
        }
    }

    // 주어진 수의 모든 약수를 구하는 함수
    static List<Integer> getDivisors(int n){
        List<Integer> factors = new ArrayList<>();
        while(n >1){
            factors.add(spf[n]);
            n /= spf[n];
        }
        // 지수별로 약수를 생성하기 위해 소인수의 지수를 계산합니다.
        List<Pair> exponents = new ArrayList<>();
        if(!factors.isEmpty()){
            int current = factors.get(0);
            int count =1;
            for(int i=1; i<factors.size(); i++){
                if(factors.get(i) == current){
                    count++;
                }
                else{
                    exponents.add(new Pair(current, count));
                    current = factors.get(i);
                    count =1;
                }
            }
            exponents.add(new Pair(current, count));
        }
        // 모든 약수를 생성합니다.
        List<Integer> divisors = new ArrayList<>();
        divisors.add(1);
        for(Pair p : exponents){
            int size = divisors.size();
            int p_power =1;
            for(int i=0; i<p.count; i++){
                p_power *= p.prime;
                for(int j=0; j<size; j++){
                    divisors.add(divisors.get(j) * p_power);
                }
            }
        }
        return divisors;
    }

    // 소인수와 그 지수를 저장하기 위한 클래스
    static class Pair {
        int prime;
        int count;
        Pair(int p, int c){
            prime = p;
            count = c;
        }
    }

    public static void main(String[] args) throws IOException{
        // SPF를 미리 계산합니다.
        computeSPF();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        while(N-- >0){
            int G = Integer.parseInt(br.readLine());
            int[] s = new int[G];
            for(int i=0; i<G; i++) {
                s[i] = Integer.parseInt(br.readLine());
            }
            if(G ==1){
                bw.write("1\n");
                continue;
            }
            // 학번을 정렬합니다.
            Arrays.sort(s);
            // 모든 가능한 두 학번의 차이를 계산합니다.
            Set<Integer> diffs = new HashSet<>();
            for(int i=0; i<G; i++) {
                for(int j=i+1; j<G; j++) {
                    diffs.add(s[j]-s[i]);
                }
            }
            // 차이의 최대값을 찾습니다.
            int max_d = Collections.max(diffs);
            // 금지된 m을 표시하기 위한 배열을 초기화합니다.
            boolean[] forbidden = new boolean[max_d +2];
            for(int d : diffs){
                if(d ==0) continue; // 학번이 중복되지 않으므로 d >=1
                List<Integer> divs = getDivisors(d);
                for(int m : divs){
                    if(m >=1 && m <= max_d +1){
                        forbidden[m] = true;
                    }
                }
            }
            // 가장 작은 m을 찾습니다.
            int answer = -1;
            for(int m=2; m<=max_d +1; m++){
                if(!forbidden[m]){
                    answer = m;
                    break;
                }
            }
            // m을 찾지 못한 경우
            if(answer == -1){
                answer = max_d +2;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
    }
}
