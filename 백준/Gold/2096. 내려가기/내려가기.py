N = int(input())

for k in range(N):
    arr = list(map(int, input().split()))

    if k == 0 :
        dp_max = arr[:]
        dp_min = arr[:]

        dp_max_next = [0]*N
        dp_min_next = [0]*N
        continue

    dp_max_next[0] = max(dp_max[0], dp_max[1]) + arr[0]
    dp_max_next[1] = max(dp_max[0], dp_max[1], dp_max[2]) + arr[1]
    dp_max_next[2] = max(dp_max[1], dp_max[2]) + arr[2]

    dp_min_next[0] = min(dp_min[0], dp_min[1]) + arr[0]
    dp_min_next[1] = min(dp_min[0], dp_min[1], dp_min[2]) + arr[1]
    dp_min_next[2] = min(dp_min[1], dp_min[2]) + arr[2]

    dp_max[0],dp_max[1],dp_max[2] = dp_max_next[0],dp_max_next[1],dp_max_next[2]
    dp_min[0],dp_min[1],dp_min[2] = dp_min_next[0],dp_min_next[1],dp_min_next[2]



print(max(dp_max),min(dp_min))
