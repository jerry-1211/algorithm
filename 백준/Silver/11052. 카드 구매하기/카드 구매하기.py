N = int(input())
arr = []

for idx,v in enumerate(map(int,input().split(" "))):
    arr.append((idx+1,v))

dp = [0] * (N+1)


for i in range(1,len(dp)):
    for idx,v in arr:
        if(i-idx >= 0):
            dp[i] = max(dp[i], dp[i-idx] + v)

print(dp[-1])



