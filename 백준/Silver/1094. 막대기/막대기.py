num = int(input())
sum = 0
while num > 0:
    sum += num % 2
    num //= 2
print(sum)