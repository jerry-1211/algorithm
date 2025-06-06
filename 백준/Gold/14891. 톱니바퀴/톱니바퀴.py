wheel = [[] for _ in range(4)]

def turn_wheel(arr,dir):
    if dir == 1:
        return [arr[-1]] + arr[:-1]
    else:
        return arr[1:] + [arr[0]]

def check(before_wheel, after_wheel):
    if before_wheel[2] != after_wheel[6]:
        return True
    return False

for i in range(4):
    wheel[i] = (list(map(int,list(input()))))

T = int(input())

for _ in range(T):
    idx,dir = map(int,input().split(" "))
    idx -= 1

    # 톱니바퀴 사전체크
    check_lst = [False,False,False]
    for i in range(3):
        if check(wheel[i],wheel[i+1]):
            check_lst[i] = True




    check_way = [0, 0, 0, 0]
    check_way[idx] = dir


    # 톱니바퀴 순환
    for i in range(idx,3):
        if check_lst[i]:
            check_way[i+1] = -check_way[i]
        else:
            break


    for i in range(idx-1,-1,-1):
        if check_lst[i]:
            check_way[i] = -check_way[i+1]
        else:
            break


    for i in range(4):
        if check_way[i] != 0 :
            wheel[i] = turn_wheel(wheel[i], check_way[i])


score = 0

for i in range(4):
    if wheel[i][0] == 1:
        score += 2**i

print(score)