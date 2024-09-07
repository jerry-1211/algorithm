N,M = map(int,input().split())
lst = list(map(int,input().split()))

start, end = 1, max(lst)
cnt = 0 

while start <= end : 
    cnt = 0 
    mid = (start + end) // 2
    for ls in lst : 
        if ls > mid : 
            cnt += (ls-mid)
    
    if cnt >= M : 
        start = mid + 1 
    elif cnt < M : 
        end = mid - 1 

print(end)
