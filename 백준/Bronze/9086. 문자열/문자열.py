T = int(input())

for _ in range(T):
    word = input()
    print(word[0], word[len(word) - 1], sep="")