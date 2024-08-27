import sys

input = sys.stdin.readline

n = int(input().strip())

if n == 1:
    sys.stdout.write("1\n")
elif n == 2:
    sys.stdout.write("3\n")
else:
    dp = [1, 3]
    for i in range(2, n):
        dp.append((dp[i-1] + (dp[i-2] * 2 % 10007)) % 10007)
    sys.stdout.write(f"{dp[n-1]}\n")