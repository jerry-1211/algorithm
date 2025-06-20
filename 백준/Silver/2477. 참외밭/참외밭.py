N = int(input())

arr = [list(map(int,input().split())) for _ in range(6)]

shape_way = [[1,3,1],[1,4,1],[2,3,2],[4,2,4]]

check_shape = arr + arr

way = []

remove = []
for i in range(len(check_shape)-3+1):
    tmp = []

    for k in range(3):
        tmp.append(check_shape[i+k][0])


    for j in range(len(shape_way)):
        if shape_way[j] == tmp:
            odd = check_shape[i:i+3]
            odd_list = [ ]

            for o  in odd:
                odd_list.append(o[0])

            if odd_list == [1,3,1]:
                remove.append(i)
                remove.append(i+1)
                break
            else:
                remove.append(i+1)
                remove.append(i+2)
                break


ms = 1
for i in remove[:2]:
    ms *= arr[i%6][1]


w, h = 0,0
for v in arr :
    if v[0] == 1 or v[0] == 2 :
        w = max(w,v[1])
    else :
        h = max(h,v[1])



print((w*h-ms) * N)


