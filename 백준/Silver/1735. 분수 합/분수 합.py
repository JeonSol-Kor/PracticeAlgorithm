def GCD(a, b):
    while b > 0:
        a, b = b, a % b
    return a

A1, B1 = map(int, input().split())
A2, B2 = map(int, input().split())

son = A1 * B2 + B1 * A2
mom = B1 * B2

gcd = GCD(son, mom)

print(son//gcd, mom//gcd)