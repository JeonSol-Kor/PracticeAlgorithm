import sys
input = sys.stdin.readline

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

N = int(input())
locations = list()
for _ in range(N):
    locations.append(int(input()))

if N == 1:
    print(0)
else:
    locations.sort()

    distances = []
    for i in range(1, N):
        distances.append(locations[i] - locations[i-1])

    g = distances[0]
    for dist in distances[1:]:
        g = gcd(g, dist)
        if g == 1:
            break

    result = 0
    for dist in distances:
        result += dist // g - 1

    print(result)