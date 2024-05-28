A = int(input())

if A % 5 == 0:
    print(A // 5)
elif A > 5 and A % 5 == 1:
    print(A // 5 + 1)
elif A > 16 and A % 5 == 2:
    print(A // 5 + 2)
elif A > 5 and A % 5 == 3:
    print(A // 5 + 1)
elif A > 5 and A % 5 == 4:
    print(A // 5 + 2)
elif A % 3 == 0:
    print(A // 3)
else:
    print(-1)