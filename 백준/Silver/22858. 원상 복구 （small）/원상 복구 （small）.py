import sys

input = sys.stdin.readline

N, K = map(int, input().strip().split())

S = list(map(int, input().strip().split()))
D = list(map(int, input().strip().split()))

P = S

for _ in range(K):
    temp = list(range(N))
    for i in range(N):
        temp[D[i] - 1] = P[i]
    P = temp

sys.stdout.write(' '.join(map(str, P)) + '\n')