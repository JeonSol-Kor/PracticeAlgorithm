N = int(input())
output = 1
if N > 0:
    for i in range(1, N+1):
        output *= i
print(output)