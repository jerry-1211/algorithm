
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**9)

lst = []
while True :
    try: 
        num = int(input())
        lst.append(num)
    except:
        break

def solution(tmp):
    if len(tmp) == 0 :
        return 
    
    tmpL,tmpR = [],[]
    mid = tmp[0]
    for i in range(1,len(tmp)):
        if tmp[i] > mid:
            tmpL = tmp[1:i]
            tmpR = tmp[i:]
            break
    else:
        tmpL = tmp[1:]
    
    solution(tmpL)
    solution(tmpR)
    print(mid)


solution(lst)