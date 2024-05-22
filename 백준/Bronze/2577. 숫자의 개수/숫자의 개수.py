A = int(input())
B = int(input())
C = int(input())

multi = A * B * C

for i in range(10):
    count = 0
    for number in str(multi):
        if number == str(i):
            count += 1
    print(count)