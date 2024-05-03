N, X = map(int, input().split())
numbers = list(map(int, input().split()))

output = ""

for number in numbers:
    if number < X:
        output += str(number) + " "

print(output)