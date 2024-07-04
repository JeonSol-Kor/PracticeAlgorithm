import sys
input = sys.stdin.readline

answer = ""

while True:
    check = input().rstrip()
    if check == ".":
        break

    stack = []
    is_balanced = True

    for char in check:
        if char == "(" or char == "[":
            stack.append(char)
        elif char == ")":
            if not stack or stack[-1] != "(":
                is_balanced = False
                break
            stack.pop()
        elif char == "]":
            if not stack or stack[-1] != "[":
                is_balanced = False
                break
            stack.pop()

    if is_balanced and not stack:
        answer += "yes\n"
    else:
        answer += "no\n"

print(answer, end="")
