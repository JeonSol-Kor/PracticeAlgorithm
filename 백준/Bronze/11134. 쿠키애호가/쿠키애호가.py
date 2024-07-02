import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N, C = map(int, input().split())
    result = N // C if N % C == 0 else N // C + 1
    print(result)