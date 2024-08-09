import sys
from collections import Counter

input = sys.stdin.readline

N = int(input().strip())
data = [int(input().strip()) for _ in range(N)]

mean = round(sum(data) / N)

sorted_data = sorted(data)
median = sorted_data[N // 2]

count = Counter(data)
max_frequency = max(count.values())
mode_candidates = [num for num, freq in count.items() if freq == max_frequency]
mode = min(mode_candidates) if len(mode_candidates) == 1 else sorted(mode_candidates)[1]

range_val = max(data) - min(data)

result = [mean, median, mode, range_val]
sys.stdout.write('\n'.join(map(str, result)) + '\n')