wheel = [[] for _ in range(4)]

def turn_wheel(arr,dir):
    if dir == 1:
        return [arr[-1]] + arr[:-1]  # 시계방향: 마지막 원소를 맨 앞으로
    else:
        return arr[1:] + [arr[0]]    # 반시계방향: 첫 원소를 맨 뒤로

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

    # 톱니바퀴 사전체크 (회전 전 상태로 체크)
    check_lst = [False,False,False]
    for i in range(3):
        if check(wheel[i],wheel[i+1]):
            check_lst[i] = True

    # 각 톱니바퀴의 회전 방향 결정
    check_way = [0,0,0,0]
    check_way[idx] = dir
    
    # 오른쪽으로 전파
    for i in range(idx, 3):
        if check_lst[i]:
            check_way[i+1] = -check_way[i]  # 반대 방향
        else:
            break
    
    # 왼쪽으로 전파
    for i in range(idx-1, -1, -1):
        if check_lst[i]:
            check_way[i] = -check_way[i+1]  # 반대 방향
        else:
            break

    # 실제 회전 수행
    for i in range(4):
        if check_way[i] != 0:
            wheel[i] = turn_wheel(wheel[i], check_way[i])

# 점수 계산
score = 0
for i in range(4):
    if wheel[i][0] == 1:  # 12시 방향이 S극(1)이면
        score += 2 ** i

print(score)
