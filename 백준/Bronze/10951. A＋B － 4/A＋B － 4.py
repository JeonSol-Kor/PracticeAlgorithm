import sys

while True:
    line = sys.stdin.readline().strip()
    if not line:
        break

    A, B = map(int, line.split())
    if A < 0 or B < 0 or A > 10 or B > 10:
        break
    else:
        sys.stdout.write(str(A + B) + "\n")

sys.stdout.flush()  # 출력 버퍼 비우기