from collections import deque

N,M = map(int,input().split())

graph = [[] for _ in range(N+1)]
graph_count = [0] * (N+1)

for _ in range(M):
  a,b = map(int,input().split())
  graph[a].append(b)
  graph_count[b] += 1
  
q = deque()
for i in range(1,N+1):
  if graph_count[i] == 0 :
    q.append(i)

while q:
  v = q.popleft()
  print(v, end = " ")
  for i in graph[v]:
    graph_count[i] -= 1 
    if graph_count[i] == 0 :
      q.append(i)
