import sys

input = sys.stdin.readline

T = int(input().strip())

dp = [0] * 12

dp[1] = 1
dp[2] = 2
dp[3] = 4

n = 11

for i in range(4, 12):
    dp[i] = dp[i-1] + dp[i-2] + dp[i-3]

for _ in range(T):
    sys.stdout.write(f"{dp[int(input().strip())]}\n")