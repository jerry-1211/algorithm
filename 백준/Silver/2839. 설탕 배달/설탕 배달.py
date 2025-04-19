N = int(input())

arr = [float('inf')] * 5100
arr[3] = arr[5] = 1

for i in range(5000):
    if arr[i] != float('inf'):
        arr[i + 3] = min(arr[i + 3], arr[i] + 1)
        arr[i + 5] = min(arr[i + 5], arr[i] + 1)


if arr[N] != float('inf'):
    print(arr[N])
else:
    print(-1)
