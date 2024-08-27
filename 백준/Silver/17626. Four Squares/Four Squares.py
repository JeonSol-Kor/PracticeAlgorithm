import math

def is_square(k):
    sqrt_k = int(math.isqrt(k))
    return sqrt_k * sqrt_k == k

n = int(input().strip())

# 1개 제곱수로 표현 가능한 경우
if is_square(n):
    print(1)
else:
    # 2개 제곱수로 표현 가능한지 확인
    for i in range(1, int(math.isqrt(n)) + 1):
        if is_square(n - i * i):
            print(2)
            break
    else:
        # 3개 제곱수로 표현 가능한지 확인
        for i in range(1, int(math.isqrt(n)) + 1):
            for j in range(1, int(math.isqrt(n - i * i)) + 1):
                if is_square(n - i * i - j * j):
                    print(3)
                    break
            else:
                continue
            break
        else:
            # 위의 경우에 해당하지 않으면 4
            print(4)