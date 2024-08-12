import sys
from collections import Counter

input = sys.stdin.readline

N, M = map(int, input().split())

word_count = Counter()

for _ in range(N):
    word = input().strip()
    if len(word) >= M:
        word_count[word] += 1

sorted_words = sorted(word_count.items(), key=lambda item: (-item[1], -len(item[0]), item[0]))

for word, _ in sorted_words:
    print(word)