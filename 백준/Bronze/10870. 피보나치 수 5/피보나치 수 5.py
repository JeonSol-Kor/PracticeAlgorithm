def Fibo(N):
    if N == 0:
        return 0
    elif N == 1:
        return 1
    else:
        return Fibo(N-1) + Fibo(N-2)

print(Fibo(int(input())))