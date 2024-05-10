word = input()
UWord = word.upper()
Index = [0] * 26
max = 0
outIndex = 0

for alphabet in UWord:
    Index[ord(alphabet) - ord("A")] += 1

for i in range(len(Index)):
    if Index[i] > max:
        max = Index[i]
        outIndex = i + ord("A")

count = 0

for i in Index:
    if max == i:
        count += 1

if count > 1:
    print("?")
else:
    print(chr(outIndex))