N = int(input())
numbers = list()

while N > 0:
    numbers.append(N % 10)
    N //= 10

numbers.sort()

for i in range(len(numbers)):
    print(numbers[len(numbers) - i - 1], end="")