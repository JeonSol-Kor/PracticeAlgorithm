import sys

input = sys.stdin.readline

# 키보드 배열을 정의합니다.
keyboard = [
    "qwertyuiop",
    "asdfghjkl",
    "zxcvbnm"
]

# 각 키의 위치를 저장합니다.
positions = {}
for r, row in enumerate(keyboard):
    for c, char in enumerate(row):
        positions[char] = (r, c)

# 초기 손가락 위치를 입력받습니다.
left_start, right_start = input().strip().split()
word = input().strip()

# 손가락 위치를 초기화합니다.
left_pos = positions[left_start]
right_pos = positions[right_start]

# 총 시간 초기화 (각 키를 누르는 시간은 1초)
total_time = 0

# 주어진 단어를 입력하는 과정에서 시간을 계산합니다.
for char in word:
    r, c = positions[char]
    # 모음과 자음에 따라 어느 손가락으로 이동할지 결정합니다.
    if char in "qwertasdfgzxcv":  # 자음은 왼손으로
        total_time += abs(left_pos[0] - r) + abs(left_pos[1] - c) + 1
        left_pos = (r, c)
    else:  # 모음은 오른손으로
        total_time += abs(right_pos[0] - r) + abs(right_pos[1] - c) + 1
        right_pos = (r, c)

print(total_time)