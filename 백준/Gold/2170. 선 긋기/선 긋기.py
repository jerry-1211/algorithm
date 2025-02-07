N = int(input())
lst = []

for _ in range(N):
    a,b = map(int,input().split())
    lst.append([a,b])

lst.sort()
merged = []

# 초기값 설정
start, end = lst[0][0],lst[0][1]

for i in range(1,N):
    a,b = lst[i][0],lst[i][1]
    if a <= end :
        end = max(end,b)
    else: 
        merged.append([start,end])
        start, end = a, b

merged.append([start,end])



print(sum([merged[i][1]-merged[i][0] for i in range(len(merged))]))