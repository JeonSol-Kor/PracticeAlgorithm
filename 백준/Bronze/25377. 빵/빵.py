N = int(input())

output = 1001
for _ in range(N):
    A, B = map(int, input().split())
    if A > B:
        continue
    if output > B:
        output = B

if output == 1001:
    output = -1

print(output)