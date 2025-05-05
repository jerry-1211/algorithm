a,b = map(int,input().split())

cnt = 0

while(True):
    cnt += 1
    if (b <= a):
        break

    if (b%2 == 0):
        b //= 2
        continue

    if (str(b)[-1] == "1" and b > 10):
        b = int((b-1)/10)
        continue

    break



if b != a :
    print(-1)
else:
    print(cnt)