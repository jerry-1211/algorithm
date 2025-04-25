import sys
from collections import deque


N = int(input())
overtaking = set()

Deagun = deque()
for _ in range(N):
    Deagun.append(input())

Youngsick = deque()
for _ in range(N):
    Youngsick.append(input())

result = 0

while Deagun:
    Deagun_car = Deagun.popleft()

    if Deagun_car in overtaking:
        continue

    while Youngsick:
        Youngsick_car = Youngsick.popleft()
        if Youngsick_car != Deagun_car :
            overtaking.add(Youngsick_car)
            result += 1
        else:
            break


print(result)