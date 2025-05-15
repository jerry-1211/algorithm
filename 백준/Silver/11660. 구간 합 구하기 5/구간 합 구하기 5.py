N,M = map(int,input().split())

arr = [[0] * (N+1)]

for _ in range(N):
    input_arr = [0] + list(map(int,input().split()))
    arr.append(input_arr)

arr_sum = [[0] * (N+1) for _ in range(N+1)]


for i in range(1,N+1):
    for j in range(1,N+1):
        arr_sum[i][j] = arr_sum[i-1][j] + arr_sum[i][j-1] - arr_sum[i-1][j-1] + arr[i][j]


for _ in range(M):
    x1,y1,x2,y2 = map(int,input().split())
    print(arr_sum[x2][y2] - arr_sum[x2][y1-1] - arr_sum[x1-1][y2] + arr_sum[x1-1][y1-1])
