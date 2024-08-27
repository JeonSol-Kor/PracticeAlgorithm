import sys

input = sys.stdin.readline

T = int(input().strip())

tri = [1, 1, 1, 2, 2]

for i in range(5, 100):
    tri.append(tri[i-1] + tri[i-5])

result = []

for _ in range(T):
    N = int(input().strip())
    result.append(tri[N-1])

sys.stdout.write('\n'.join(map(str, result)) + '\n')