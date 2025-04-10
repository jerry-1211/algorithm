N,d,K,C = map(int,input().split())
lst = []
for _ in range(N):
    lst.append(int(input()))
lst = lst+lst

mx = 0
for i in range(N):
    tmp = lst[i:i+K]
    tmp.append(C)
    mx = max(len(set(tmp)),mx)
print(mx)
