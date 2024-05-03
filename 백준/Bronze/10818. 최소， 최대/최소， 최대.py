N = int(input())
numbers = list(map(int, input().split()))

min = numbers[0]
max = numbers[0]

for number in numbers:
    if(number > max):
        max = number
    if(number < min):
        min = number

print(min, max)