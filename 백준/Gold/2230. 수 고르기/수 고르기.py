N,M = list(map(int,input().split()))
lst = []

for _ in range(N):
    lst.append(int(input()))
lst.sort()


start,end = 0,1
mn = 1e10

while True:
    if end == N-1 and lst[end]-lst[start]<M:
        break

    if lst[end] - lst[start] < M:
        end += 1
    elif lst[end] - lst[start] == M :
        mn = M
        break
    else :
        mn = min(mn,lst[end]-lst[start])
        start += 1

print(mn)