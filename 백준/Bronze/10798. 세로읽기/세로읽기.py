arr = [input() for _ in range(5)]

for i in range(15):
    for ar in arr:
        if i >= len(ar):
            continue
        print(ar[i],end="")

