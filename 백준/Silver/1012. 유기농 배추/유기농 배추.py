import sys
sys.setrecursionlimit(10000)

input = sys.stdin.readline
print = sys.stdout.write

def dfs(x, y):
    # 현재 위치를 방문 처리
    field[y][x] = 0
    # 상하좌우 탐색
    for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
        nx, ny = x + dx, y + dy
        # 범위 안에 있고, 배추가 있는 곳이면 재귀적으로 DFS 실행
        if 0 <= nx < M and 0 <= ny < N and field[ny][nx] == 1:
            dfs(nx, ny)

T = int(input().strip())

for _ in range(T):
    M, N, K = map(int, input().strip().split())
    field = [[0] * M for _ in range(N)]

    for _ in range(K):
        X, Y = map(int, input().strip().split())
        field[Y][X] = 1
    
    count = 0
    for i in range(M):
        for j in range(N):
            if field[j][i] == 1:
                dfs(i, j)
                count += 1
    
    print(f"{count}\n")