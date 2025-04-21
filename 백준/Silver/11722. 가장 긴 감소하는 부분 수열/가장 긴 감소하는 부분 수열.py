N = int(input())
arr = list(map(int,input().split()))

dp = [0] * 2000

for i in range(len(arr)):
    idx = arr[i]
    dp[idx] = max(dp[idx+1:]) + 1

print(max(dp))
