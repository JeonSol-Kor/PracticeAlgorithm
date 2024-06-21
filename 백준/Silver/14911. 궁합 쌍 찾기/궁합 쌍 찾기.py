numbers = list(map(int, input().split()))
target = int(input())

pairs = list()

for i in range(len(numbers)):
    for j in range(i + 1, len(numbers)):
        if i != j and numbers[i] +numbers[j] == target:
            pairs.append((min(numbers[i], numbers[j]), max(numbers[i], numbers[j])))

pairs = list(set(pairs))
pairs.sort()

for pair in pairs:
    print(*pair)
print(len(pairs))