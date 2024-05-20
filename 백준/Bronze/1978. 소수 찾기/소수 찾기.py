N = int(input())
count = N

numbers = map(int, input().split())

for i in numbers:
    if i == 1:
        count -= 1
    else:
        for j in range(2, i):
            if i % j == 0:
                count -= 1
                break
print(count)