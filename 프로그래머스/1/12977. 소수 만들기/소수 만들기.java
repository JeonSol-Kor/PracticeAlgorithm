class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 주어진 배열에서 서로 다른 3개의 수를 선택하기 위한 세 중첩된 반복문
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    // 소수인지 확인하는 함수 호출
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    // 소수인지 확인하는 함수
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
