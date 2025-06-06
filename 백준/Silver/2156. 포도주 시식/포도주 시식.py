N = int(input())
arr = []

for i in range(N):
    arr.append(int(input()))

if N == 1:
    mx = arr[0]
elif N == 2:
    mx = arr[0] + arr[1]
else:
    dp = [0] * N
    dp[0] = arr[0]
    dp[1] = arr[0] + arr[1]
    dp[2] = max(arr[2] + arr[1], arr[2] + arr[0], dp[1])
    
    for i in range(3, N):
        dp[i] = max(dp[i-1], arr[i] + arr[i-1] + dp[i-3], arr[i] + dp[i-2])
    
    mx = dp[N-1]

print(mx)