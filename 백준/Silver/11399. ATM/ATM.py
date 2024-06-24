N = int(input())
times = list(map(int, input().split()))

result = 0
times.sort()
for i in range(N):
    result += times[i] * (N - i)
print(result)