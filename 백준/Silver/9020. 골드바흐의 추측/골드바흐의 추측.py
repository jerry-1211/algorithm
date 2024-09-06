N =  int(input())

visited = [0] * 12000
visited[0],visited[1] = 0,0

# 에라토스테네스체 
for i in range(2, 12000):
    mul = 2 
    while True:
        v = i * mul 
        if v > 11000 : 
            break 
        visited[v] = 1
        mul += 1

for _ in range(N) :
    even = int(input())
    rs = [0,0]
    for i in range(2,(even//2+1)): 
        if not(visited[i]) and not(visited[even-i]):
            rs = [i,even-i]
    print(*rs)
        
