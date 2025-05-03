T = int(input())

for _ in range(T):
    N = int(input())


    dp = [[0] * N for _ in range(2)]
    arr = [list(map(int,input().split(" "))) for _ in range(2)]

    if N == 1:
        print(max(max(arr[0]),max(arr[1])))  
    else:
        dp[0][0], dp[1][0] = arr[0][0], arr[1][0]
        dp[1][1], dp[0][1] = arr[1][1] + arr[0][0], arr[1][0] + arr[0][1]


        H = len(arr)
        W = len(arr[0])


        for w in range(2,W):

            x = dp[0][w - 2]
            y = dp[1][w - 2]

            a = dp[0][w-1]
            b = dp[1][w-1]

            p = arr[0][w]
            q = arr[1][w]

            dp[0][w] = max(x, y, b) + arr[0][w]
            dp[1][w] = max(x, y, a) + arr[1][w]


        print(max(max(dp[0]),max(dp[1])))
