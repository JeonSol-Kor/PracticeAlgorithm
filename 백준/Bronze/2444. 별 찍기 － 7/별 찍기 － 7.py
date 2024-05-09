N = int(input())

for i in range(1, 2*N):
    if i <= N:
        for _ in range(N-i):
            print(" ", end="")
        for _ in range(2*i-1):
            print("*", end="")
    else:
        for _ in range(i-N):
            print(" ", end="")
        for _ in range((2*N-i)*2-1):
            print("*", end="")
    print()