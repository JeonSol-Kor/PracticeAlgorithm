import sys

# 행렬의 크기 N, M을 입력받습니다.
N, M = map(int, sys.stdin.readline().split())

# 행렬 A를 입력받습니다.
A = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

# 행렬 B를 입력받습니다.
B = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]

# 두 행렬을 더하여 결과를 출력합니다.
for i in range(N):
    for j in range(M):
        sys.stdout.write(str(A[i][j] + B[i][j]) + " ")
    sys.stdout.write("\n")  # 한 행이 끝나면 줄을 바꿉니다.
