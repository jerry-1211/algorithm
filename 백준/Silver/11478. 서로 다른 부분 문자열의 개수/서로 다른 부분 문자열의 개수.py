arr = list(input())
L = len(arr)
S = set()

for i in range(1,L+1):
    for j in range(0,L):
        if j+i > L:
            continue
        # print("[", j,":",j+i, "]")
        S.add("".join(arr[j:j+i]))


print(len(S))