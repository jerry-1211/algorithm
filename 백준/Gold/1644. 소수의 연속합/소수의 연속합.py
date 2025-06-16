N = int(input())

MAX_VALUE = N + 1_000
arr = [0] * MAX_VALUE
arr[0],arr[1] = 1,1

cnt = 2
while cnt < MAX_VALUE:
    value = cnt * 2
    if arr[cnt] == 0:
        for i in range(value,MAX_VALUE,cnt):
            if i < MAX_VALUE:
                arr[i] = 1
            else:
                break
    cnt += 1


lst = []
for i in range(len(arr)):
    if arr[i] == 0 and i <= N:
        lst.append(i)


start = 0
end = 0

cnt = 0
result = 0
while(True):

    if result == N:
        cnt += 1

    if result <= N  and end < len(lst):
        result += lst[end]
        end += 1

    elif result > N :
        result -= lst[start]
        start += 1

    else:
        break


print(cnt)

