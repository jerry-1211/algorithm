N = int(input())
lst = list(input())
dp = [float('inf')] * len(lst)
dp[0] = 0

for i in range(len(lst)):
  for j in range(i+1,len(lst)):
    if (lst[i] == 'B' and lst[j]== 'O') or (lst[i] == 'O' and lst[j]== 'J') or (lst[i] == 'J' and lst[j]== 'B'):
      dp[j] = min(dp[j], dp[i] + (j-i)**2)
    

print(dp[-1] if dp[-1] != float('inf') else -1 )
    
    