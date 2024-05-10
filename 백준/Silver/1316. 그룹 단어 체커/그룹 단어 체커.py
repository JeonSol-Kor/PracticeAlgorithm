T = int(input())

count = T

for _ in range(T):
    word = input()
    for i in range(1, len(word)):
        if word.index(word[i-1]) > word.index(word[i]):
            count -= 1
            break

print(count)