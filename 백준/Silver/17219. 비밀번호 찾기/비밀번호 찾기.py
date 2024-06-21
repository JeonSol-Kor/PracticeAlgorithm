import sys
input = sys.stdin.readline

N, M = map(int, input().split())
addrPw = {}
for _ in range(N):
    addr, pw = map(str, input().split())
    addrPw[addr] = pw

result = ""
for _ in range(M):
    request = input().strip()
    result += addrPw[request]+"\n"
print(result, end="")