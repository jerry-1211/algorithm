import sys
from collections import deque
input = sys.stdin.readline

N,M,K,X = map(int,input().split())
linked_lst = [[] for _ in range(N+1)]
cost = [-1] * (N+1)

for _ in range(M):
    s,e = map(int,input().split())
    linked_lst[s].append(e)

q =deque([X])
cost[X] = 0


while q:
    v = q.popleft()
    
    for e in linked_lst[v]:    
        if cost[e] == -1 :
            cost[e] = cost[v] + 1
            q.append(e)

found = False


for idx,i in enumerate(cost):
    if i == K :         
        print(idx)
        found = True
    
if not found:
    print(-1)
