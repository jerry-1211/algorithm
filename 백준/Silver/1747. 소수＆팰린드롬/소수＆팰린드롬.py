arr = [0] * 2_000_000
arr[0],arr[1] = 1,1

cnt = 2
while(cnt<2_000_000):
    if arr[cnt] == 0:
        for i in range(cnt*2,2_000_000,cnt):
            arr[i] = 1
    cnt += 1

N = int(input())

result = 0
for i in range(N,len(arr)):
    if arr[i] == 0 and str(i) == str(i)[::-1]:
        result = i
        break

print(result)


