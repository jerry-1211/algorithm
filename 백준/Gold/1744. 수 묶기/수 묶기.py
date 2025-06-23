N = int(input())

low = []
mid = []
high = []

for _ in range(N):
    v = int(input())
    if v == 1 or v == 0:
        mid.append(v)
    elif (v > 1):
        high.append(v)
    else:
        low.append(v)


low = sorted(low,reverse=True)
high = sorted(high)

result_l = 0
result_h = 0


flag = False
if len(low) == 1:
    flag = True
elif len(low) == 0 :
    result_l = 0

if len(low) % 2 == 1 and 0 in mid:
    low.pop(0)

while(low):

    if flag:
        l = low.pop()
        result_l = l

    if len(low) >= 2:
        tmp = 1
        for _ in range(2):
            l = low.pop()
            tmp *= l
        result_l += tmp

    if len(low) == 1:
        l = low.pop()
        result_l += l
        break

    if len(low) == 0:
        break


while(high):
    if len(high) >= 2:
        tmp = 1
        for _ in range(2):
            h = high.pop()
            tmp *= h
        result_h += tmp

    if len(high) == 1:
        h = high.pop()
        result_h += h
        break

    if len(high) == 0:
        break

print(result_h + result_l + sum(mid))



