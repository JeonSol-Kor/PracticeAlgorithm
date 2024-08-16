import sys

input = sys.stdin.readline

dwarfs = [int(input().strip()) for _ in range(9)]

total_sum = sum(dwarfs)
target_sum = 100
excess = total_sum - target_sum

idx1, idx2 = -1, -1
for i in range(8):
    for j in range(i + 1, 9):
        if dwarfs[i] + dwarfs[j] == excess:
            idx1, idx2 = i, j
            break
    if idx1 != -1:
        break

real_dwarfs = [dwarfs[i] for i in range(9) if i != idx1 and i != idx2]

real_dwarfs.sort()

sys.stdout.write('\n'.join(map(str, real_dwarfs)) + '\n')