import sys

data = sys.stdin.read().splitlines()

N, M = map(int, data[0].split())

pokemons = {}

for i in range(1, N + 1):
    pokemonName = data[i]
    pokemons[str(i)] = pokemonName
    pokemons[pokemonName] = str(i)

questions = data[N + 1:]

answer = []

for question in questions:
    if question.isdigit():
        answer.append(pokemons[question])
    else:
        answer.append(pokemons[question])

print("\n".join(answer))
