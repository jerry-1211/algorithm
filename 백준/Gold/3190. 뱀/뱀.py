import sys
sys.setrecursionlimit(100000) 

N = int(input())
K = int(input())
graph = [[0]*N for _ in range(N)]

for _ in range(K):
    i,j = map(int,input().split())
    graph[i-1][j-1] = 1

L = int(input())
direction_order = []
for _ in range(L):
    tmp = list(input().split())
    direction_order.append([int(tmp[0]),tmp[1]])


location = [[0,0]]
di,dj = [0,1,0,-1], [1,0,-1,0]
count = 0
k = 0

while True:
    last = location[-1] 
    if 0<=last[0]<N and 0<=last[1]<N :
        if direction_order : 
            if count == direction_order[0][0] :
                # 방향 정하기 
                if direction_order[0][1] == 'D':
                    k += 1
                    k %= 4
                elif direction_order[0][1] == 'L':
                    k -= 1
                    k %= 4
                # 방향 오더 개수 제거 
                direction_order = direction_order[1:]


        if [last[0]+di[k], last[1]+dj[k]] in location :
            count += 1
            break 
        location.append([last[0]+di[k], last[1]+dj[k]])
    
        # 뱀 길이 확장 
        if 0<=last[0]+di[k]<N and 0<=last[1]+dj[k]<N :        
            if graph[last[0]+di[k]][last[1]+dj[k]] == 0 :
                location = location[1:]
            else : 
                graph[last[0]+di[k]][last[1]+dj[k]] = 0
        else: 
            count += 1 
            break           
        
    else: 
        break
    count += 1 

print(count)