import sys

input = sys.stdin.readline

K, N = map(int, input().strip().split())

cables = list(int(input().strip()) for _ in range(K))

high = max(cables)
low = 1
result = 0

while low <= high:
    count = 0
    mid = (low + high) // 2

    for cable in cables:
        count += cable // mid

    if count >= N:
        result = mid
        low = mid + 1
    else:
        high = mid - 1

sys.stdout.write(str(result) + '\n')