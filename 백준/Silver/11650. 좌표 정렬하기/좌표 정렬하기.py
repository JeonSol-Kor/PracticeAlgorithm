import sys

N = int(sys.stdin.readline())
coordinates = list()
for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    coordinates.append((x, y))
    
coordinates.sort(key=lambda coord: (coord[0], coord[1]))

for coord in coordinates:
    sys.stdout.write(f"{coord[0]} {coord[1]}\n")