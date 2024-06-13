import sys

data = sys.stdin.read().splitlines()

n = int(data[0])

workerInCom = set()

for i in range(1, n + 1):
        name, status = data[i].split()
        if status == "enter":
            workerInCom.add(name)
        elif status == "leave":
            workerInCom.discard(name)

output = []

for person in sorted(workerInCom, reverse=True):
    output.append(person + "\n")

sys.stdout.write(''.join(output))