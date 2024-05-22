numbers = list(map(int, input().split()))
numberSum = 0
for number in numbers:
    numberSum += number**2
print(numberSum%10)