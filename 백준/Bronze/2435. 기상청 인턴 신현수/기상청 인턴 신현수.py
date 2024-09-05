import sys

input = sys.stdin.readline

N, K = map(int, input().strip().split())

nums = list(map(int, input().strip().split()))

max = -300

for i in range(K - 1, N):
    sum = 0
    for j in range(K):
        sum += nums[i - j]
    if sum > max:
        max = sum

print(max)