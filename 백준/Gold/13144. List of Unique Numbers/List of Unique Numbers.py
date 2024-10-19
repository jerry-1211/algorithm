import sys
input = sys.stdin.readline

N = int(input())
lst = list(map(int,input().split()))

number = set()
rs = sp = 0 

for ep in range(N):
    while lst[ep] in number : 
        number.remove(lst[sp])
        sp += 1 
    number.add(lst[ep])
    rs = rs + ep - sp + 1

print(rs)