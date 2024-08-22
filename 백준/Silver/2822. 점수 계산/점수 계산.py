import sys

input = sys.stdin.readline

nums = [int(input()) for _ in range(8)]
idx_nums = [(num, i + 1) for i, num in enumerate(nums)]
sorted_nums = sorted(idx_nums, key=lambda x: x[0], reverse=True)
top_nums = sorted_nums[:5]
total_sum = sum(num for num, _ in top_nums)
indices = sorted(index for _, index in top_nums)

sys.stdout.write(f"{total_sum}\n")
sys.stdout.write(" ".join(map(str, indices)) + "\n")