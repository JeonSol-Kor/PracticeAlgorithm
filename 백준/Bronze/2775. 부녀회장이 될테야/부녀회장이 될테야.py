def live(k, n):
    people = [i for i in range(1, n + 1)]
    for floor in range(1, k + 1):
        for i in range(1, n):
            people[i] += people[i - 1]
    
    return people[-1]

T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())
    print(live(k, n))