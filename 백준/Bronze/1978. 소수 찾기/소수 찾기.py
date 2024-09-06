N =  int(input())
lst = list(map(int,input().split()))
mx = max(lst)
visited = [1] * (mx+1)
visited[0],visited[1] = 0,0

for i in range(2, mx+10):
    mul = 2 
    while True:
        v = i * mul 
        if v > mx : 
            break 
        visited[v] = 0
        mul += 1

rs = 0 
for i in lst:
    rs += visited[i]

print(rs)