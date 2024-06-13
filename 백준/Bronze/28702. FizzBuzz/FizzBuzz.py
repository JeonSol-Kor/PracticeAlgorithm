numbers = list()
for i in range(3):
    numbers.append(input())
answer = 0

for i in range(3):
    if numbers[i] != "FizzBuzz" and numbers[i] != "Fizz" and numbers[i] != "Buzz":
        answer = int(numbers[i]) + 3 - i
        break

if answer % 3 == 0 and answer % 5 ==0:
    print("FizzBuzz")
elif answer % 3 == 0:
    print("Fizz")
elif answer % 5 == 0:
    print("Buzz")
else:
    print(answer)