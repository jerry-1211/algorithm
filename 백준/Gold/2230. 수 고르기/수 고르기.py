N,M = map(int,input().split())
arr =[]

for _ in range(N):
    arr.append(int(input()))

arr.sort()
result = float("inf")

L,R = 0,1

while(True):
    if R == len(arr)-1 and arr[R] - arr[L] < M :
        break

    if arr[R] - arr[L] == M:
        result = M
        break

    if arr[R] - arr[L] > M:
        result = min(result, arr[R] - arr[L])
        L += 1
    elif arr[R] - arr[L] < M:
        R += 1

    
print(result)