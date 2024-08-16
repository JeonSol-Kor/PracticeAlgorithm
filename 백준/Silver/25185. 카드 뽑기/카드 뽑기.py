import sys

input = sys.stdin.readline

T = int(input().strip())
results = []

for _ in range(T):
    emotion = ":("

    suit_map = {}

    cards = input().strip().split()
    first_count_same = 0
    second_count_same = 0
    third_count_same = 0

    for i, card in enumerate(cards):
        num = int(card[:-1])
        suit = card[-1]
        if suit not in suit_map:
            suit_map[suit] = set()
        suit_map[suit].add(num)

        if card == cards[0]:
            first_count_same += 1
        if card == cards[1]:
            second_count_same += 1
        if card == cards[2]:
            third_count_same += 1

    for numbers in suit_map.values():
        if len(numbers) >= 3:
            sorted_numbers = sorted(numbers)
            for i in range(len(sorted_numbers) - 2):
                if (sorted_numbers[i] + 1 == sorted_numbers[i + 1] and
                        sorted_numbers[i] + 2 == sorted_numbers[i + 2]):
                    emotion = ":)"
                    break

    if first_count_same > 2 or second_count_same > 2:
        emotion = ":)"
    if first_count_same == 2 and second_count_same == 2 and third_count_same == 2:
        emotion = ":)"

    results.append(emotion)

sys.stdout.write("\n".join(results) + "\n")