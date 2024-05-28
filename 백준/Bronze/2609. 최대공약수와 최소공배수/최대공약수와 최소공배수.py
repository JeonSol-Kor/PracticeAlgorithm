A, B = map(int, input().split())
mini = min(A, B)
denominator = 0
for i in range(0, mini):
    if A % (mini - i) == 0 and B % (mini - i) == 0:
        denominator = mini - i
        break
multiple = A * (B // denominator)

print(denominator)
print(multiple)