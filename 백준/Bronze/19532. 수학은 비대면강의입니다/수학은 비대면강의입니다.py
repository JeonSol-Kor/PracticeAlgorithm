a, b, c, d, e, f = map(int, input().split())

if a == 0:
    y = c // b
    x = (c * e - b * f) // (a * e - b * d)
elif b == 0:
    x = c // a
    y = (c * d - f * a) // (b * d - e * a)
elif d == 0:
    y = f // e
    x = (c * e - b * f) // (a * e - b * d)
elif e == 0:
    x = f // d
    y = (c * d - f * a) // (b * d - e * a)
else:
    y = (c * d - f * a) // (b * d - e * a)
    x = (c - b * y) // a
print(x, y)
