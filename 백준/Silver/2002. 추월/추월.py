from collections import deque

N = int(input())
over = set()

arr1 = deque()
for _ in range(N):
    arr1.append(input())

arr2 = []
for _ in range(N):
    arr2.append(input())
arr2.reverse()

result = 0

while arr1:
    tmp1 = arr1.popleft()

    if tmp1 in over:
        continue

    while arr2:
        tmp2 = arr2.pop()
        if tmp2 != tmp1 :
            over.add(tmp2)
            result += 1
        else:
            break


print(result)