import sys
input = sys.stdin.readline

def main():
    n = int(input().strip())
    words = [input().strip() for _ in range(n)]
    words = list(set(words))  # 중복 제거
    words.sort(key=lambda x: (len(x), x))  # 길이, 사전 순으로 정렬
    print("\n".join(words))

if __name__ == "__main__":
    main()
