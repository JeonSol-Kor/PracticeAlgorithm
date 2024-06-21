word = input()

wordSet = set()

wordSet.add(word)
for i in range(1, len(word)):
    for j in range(len(word) - i + 1):
        wordSet.add(word[j : j + i])

print(len(wordSet))