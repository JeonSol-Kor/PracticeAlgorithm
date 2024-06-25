import sys
input = sys.stdin.readline

dungChis = list()
N = int(input())

for _ in range(N):
    x, y = map(int, input().split())
    dungChis.append([x, y])

answer = list()
for i in range(N):
    count = 1
    for j in range(N):
        if dungChis[i][0] < dungChis[j][0] and dungChis[i][1] < dungChis[j][1]:
            count += 1
    answer.append(count)

print(*answer)