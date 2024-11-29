class Solution {
    public int solution(int n) {
        int answer = n / gcd(n, 6);
        return answer;
    }
    public int gcd(int A, int B){
        if(A % B == 0) return B;
        return gcd(B, A % B);
    }
}