import sys
numbers = []
sum = 0
for i in range(5):
    numbers.append(int(sys.stdin.readline()))
    sum += numbers[i]
numbers.sort()
sys.stdout.write(f"{sum//5}\n{numbers[2]}")
