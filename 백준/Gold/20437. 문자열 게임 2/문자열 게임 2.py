import sys



T = int(input())

for _ in range(T):
    W = input()
    K = int(input())
    dict = {}
    s = set()

    for i in range(ord('a'),ord('z')+1):
        dict[chr(i)] = []

    for i in range(len(W)):
        dict[W[i]].append(i)

    for v in dict.values():
        if(len(v) >= K):
            for q in range(len(v)-K+1):
                s.add(v[q+K-1] - v[q] + 1)


    if (s):
        print(min(s), max(s))
    else:
        print(-1)



