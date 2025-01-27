from heapq import heappop,heappush

N = int(input())
M = int(input())
lst = [[] for _ in range(N+1)]

for _ in range(M):
  start,end,cost = map(int,input().split())
  lst[start].append((end,cost))

departure, arrival = map(int,input().split())

distance = [float('INF')] * (N+1)
distance[departure] = 0
queue = [(0,departure)]


while queue :
  current_cost,currnt_node = heappop(queue)

  if current_cost > distance[currnt_node]: 
    continue
  
  for next_node,weight in lst[currnt_node]:
    new_cost = current_cost + weight
    if new_cost < distance[next_node]:
      distance[next_node] = new_cost
      heappush(queue,(new_cost,next_node))


print(distance[arrival])

