class Solution {
    public long solution(String numbers) {
        String[] numStrs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < 10; i++){
            numbers = numbers.replace(numStrs[i], String.valueOf(i));
        }
        long answer = Long.parseLong(numbers);
        return answer;
    }
}