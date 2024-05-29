import sys
input = sys.stdin.readline

def main():
    n = int(input().strip())
    count = [0] * 10001
    
    for _ in range(n):
        num = int(input().strip())
        count[num] += 1
    
    for i in range(10001):
        if count[i] > 0:
            for _ in range(count[i]):
                print(i)

if __name__ == "__main__":
    main()