import sys
input = sys.stdin.read

def fibonacci(n):
    if n == 0:
        return (1, 0)
    elif n == 1:
        return (0, 1)
    else:
        dp = [(0, 0)] * (n + 1)
        dp[0] = (1, 0)
        dp[1] = (0, 1)
        for i in range(2, n + 1):
            dp[i] = (dp[i-1][0] + dp[i-2][0], dp[i-1][1] + dp[i-2][1])
        return dp[n]

data = input().strip().split()
t = int(data[0])
test_cases = [int(data[i]) for i in range(1, t + 1)]

results = []
for n in test_cases:
    zero_count, one_count = fibonacci(n)
    results.append((zero_count, one_count))

for result in results:
    print(result[0], result[1])
