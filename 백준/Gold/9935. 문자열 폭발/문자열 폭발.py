word = input()
boom = input()
L = len(boom)

stack = list(word[:L])


for w in word[L:]:
    if "".join(stack[len(stack)-L:]) == boom :
        for _ in range(L):
            stack.pop()

    stack.append(w)

if "".join(stack[len(stack) - L:]) == boom:
    for _ in range(L):
        stack.pop()

result = "".join(stack)

if len(result) == 0 :
    print("FRULA")
else:
    print(result)


