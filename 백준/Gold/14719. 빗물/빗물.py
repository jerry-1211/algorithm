H,W = map(int,input().split())
lst = list(map(int,input().split()))
N = len(lst)

left = [0] * N
right = [0] * N

for i in range(N): 
  left[i] = max(lst[0:i+1])

for i in range(N-1,-1,-1):
  right[i] = max(lst[i:N])

sum = 0 
for i in range(N):
  sum += min(left[i],right[i]) - lst[i]

print(sum)