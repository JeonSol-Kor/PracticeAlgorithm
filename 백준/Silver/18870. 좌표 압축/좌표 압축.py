import sys

N = int(sys.stdin.readline().strip())
nums = list(map(int, sys.stdin.readline().split()))

sorted_nums = sorted(set(nums))
rank_dict = {num: rank for rank, num in enumerate(sorted_nums)}

result = [rank_dict[num] for num in nums]
print(" ".join(map(str, result)))