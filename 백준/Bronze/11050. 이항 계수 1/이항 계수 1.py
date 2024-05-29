def factorial(num):
    facto = 1
    while(num > 0):
        facto *= num
        num -= 1
    return facto

N, K = map(int, input().split())

print(factorial(N) // ((factorial(N-K)) * factorial(K)))