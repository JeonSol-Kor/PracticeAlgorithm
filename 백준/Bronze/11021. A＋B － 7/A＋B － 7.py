import sys

# 테스트케이스의 개수를 입력으로 받음
T = int(sys.stdin.readline()) 

# 테스트케이스의 개수만큼 반복
for i in range(T):
    # 한 줄을 읽어들여 공백을 기준으로 분리하여 정수로 변환하여 A와 B에 할당
    A, B = map(int, sys.stdin.readline().rstrip().split())
    # A와 B의 합을 출력
    print("Case #{}: {}".format(i+1, A+B))