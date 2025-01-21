N,S = map(int,input().split())
lst = list(map(int,input().split()))
mn = float('inf')

start = result = 0 

for end in range(len(lst)):
  result += lst[end]
  while result >= S:
    mn = min(mn, end-start+1)
    result -= lst[start]
    start += 1
    

if mn == float('inf') :
  print(0)
else: 
  print(mn)