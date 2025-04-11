import sys

N = int(input())

extension = []
for _ in range(N):
    str = input()
    extension.append(str.split(".")[1])

result = {}

for ex in extension:
    if ex in result:
        result[ex] += 1
    else:
        result[ex] = 1

for r in sorted(result.items()):
    print(r[0]  , r[1])
    