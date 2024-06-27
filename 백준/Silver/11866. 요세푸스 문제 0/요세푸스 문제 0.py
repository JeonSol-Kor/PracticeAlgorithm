from collections import deque

def josephus_problem(n, k):
    # 1부터 n까지의 숫자를 deque에 담기
    queue = deque(range(1, n + 1))
    
    result = []

    while queue:
        # k-1번 rotate (k번째 사람이 앞에 오도록)
        queue.rotate(-(k - 1))
        # k번째 사람을 제거하고 결과 리스트에 추가
        result.append(queue.popleft())
    
    return result

# 입력 받기
n, k = map(int, input().split())

# 요세푸스 순열 구하기
josephus_sequence = josephus_problem(n, k)

# 결과 출력 (요세푸스 순열을 요구하는 형식으로 출력)
print("<" + ", ".join(map(str, josephus_sequence)) + ">")