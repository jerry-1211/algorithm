N = int(input())

for _ in range(N):
    arr = list(input().split(" "))
    other = []
    while(True):
        word = input()

        if (word == "what does the fox say?"):
            break

        if (word.split(" ")[0] != "fox"):
            other.append(word.split(" ")[2])

    result = []
    for i in range(len(arr)):
        if arr[i] not in other:
            result.append(arr[i])

    print(*result)