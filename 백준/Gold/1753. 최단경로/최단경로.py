import heapq
import sys
input = sys.stdin.readline
INF = sys.maxsize

V,E = map(int,input().split())
K =  int(input())
edge = [[] for _ in range(V+1)]
dist = [INF] * (V+1)

dist[K] = 0
heap = [[0,K]]

for _ in range(E):
    u,v,w = map(int,input().split())
    edge[u].append((w,v))

while heap :
    ew,ev = heapq.heappop(heap) # 가장 작은 것  출력 
    # if dist[ev] != ew : continue
    for nw,nv in edge[ev]:
        if dist[nv] > nw + ew :
            dist[nv] = nw + ew 
            heapq.heappush(heap,[dist[nv],nv])


for i in range(1,V+1):
    if dist[i] == INF: print("INF")
    else: print(dist[i])

    
