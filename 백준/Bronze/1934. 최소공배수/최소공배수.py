import sys

def maxAliquot(A, B):
    while B > 0:
        A, B = B, A % B
    return A

def minMultiple(A, B):
    return A * B // maxAliquot(A, B)

T = int(sys.stdin.readline().strip())

multiple = 0
aliquot = 0

for _ in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(minMultiple(A, B))