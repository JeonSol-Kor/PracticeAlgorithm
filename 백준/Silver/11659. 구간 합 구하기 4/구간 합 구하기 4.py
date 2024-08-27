import sys

input = sys.stdin.readline

N, M = map(int, input().strip().split())

nums = list(map(int, input().strip().split()))
sums = list()
sum = 0
sums.append(0)

for i in range(N):
    sum += nums[i]
    sums.append(sum)

result = []

for _ in range(M):
    i, j = map(int, input().strip().split())
    result.append(sums[j] - sums[i-1])

sys.stdout.write('\n'.join(map(str, result)) + '\n')