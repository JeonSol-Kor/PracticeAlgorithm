X = int(input())
sequence = 0
n = 1
donominator = 1
numerator = 1

while X > sequence:
    sequence = int(n * (n + 1) / 2)
    n += 1

if n % 2 == 0:
    denominator = n - (sequence - X) - 1
    numerator = n - denominator
else:
    numerator = n - (sequence - X) - 1
    denominator = n - numerator

print(f"{numerator}/{denominator}")