import math

def main():
    A, B, V = map(int, input().split())

    days = math.ceil((V - B) / (A - B))
    print(days)

if __name__ == "__main__":
    main()
