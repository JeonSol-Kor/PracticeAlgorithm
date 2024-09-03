import sys
from collections import deque

input = sys.stdin.readline

def dfs(nums, start, check, result):
    check[start] = True
    result.append(start)
    for num in sorted(nums[start]):
        if not check[num]:
            dfs(nums, num, check, result)

def bfs(nums, start, check, result):
    waiting = deque([start])
    check[start] = True
    while waiting:
        next = waiting.popleft()
        result.append(next)
        for num in sorted(nums[next]):
            if not check[num]:
                waiting.append(num)
                check[num] = True

N, M, V = map(int, input().strip().split())

nums = {i: [] for i in range(1, N+1)}

for _ in range(M):
    A, B = map(int, input().strip().split())
    nums[A].append(B)
    nums[B].append(A)

result = list()
check = [False] * (N + 1)
dfs(nums, V, check, result)
sys.stdout.write(" ".join(map(str, result)) + '\n')

result = list()
check = [False] * (N + 1)
bfs(nums, V, check, result)
sys.stdout.write(" ".join(map(str, result)) + '\n')