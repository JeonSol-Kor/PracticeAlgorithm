class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcd = GCD(denom1, denom2); 
        int denom = denom1 * denom2 / gcd;
        int numer = (numer1 * denom2 + numer2 * denom1) / gcd;
        
        int resultGCD = GCD(numer, denom);
        numer /= resultGCD;
        denom /= resultGCD;
        
        int[] answer = {numer, denom};
        return answer;
    }
    public int GCD(int a, int b){
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}