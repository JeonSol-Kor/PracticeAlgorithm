import sys

input = sys.stdin.readline

T = int(input().strip())

count = 0

def recursion(s, l, r):
    global count
    count += 1
    if l >= r: return 1
    elif s[l] != s[r]: return 0
    else: return recursion(s, l+1, r-1)

def isPalindrome(s):
    return recursion(s, 0, len(s)-1)

Ss = list(input().strip() for _ in range(T))

for S in Ss:
    count = 0
    sys.stdout.write(f"{isPalindrome(S)} {count}\n")