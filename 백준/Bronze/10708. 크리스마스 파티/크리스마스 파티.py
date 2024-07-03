import sys
input = sys.stdin.readline

N = int(input().strip())
M = int(input().strip())

answers = list(map(int, input().split()))
score = [0] * N

for i in range(M):
    targets = list(map(int, input().split()))
    extra = 0
    for j in range(N):
        if targets[j] == answers[i]:
            score[j] += 1
        else:
            extra += 1
    score[answers[i] - 1] += extra

print("\n".join(map(str, score)), end="")