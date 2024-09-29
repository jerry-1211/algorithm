import sys

lst = list(input())
operations = ['+',"-"]
num = []
current = 0 
tmp = ""

while True : 
    
    if lst[current] in operations:
        num.append(int(tmp))
        num.append(lst[current])
        tmp = ""
        current += 1
        continue

    tmp += lst[current]
    current += 1


    if current == len(lst):
        num.append(int(tmp))
        break


rs = []
hap = 0
for i in range(len(num)) :
    if num[i] == "-":
        rs.append(hap)
        rs.append(num[i])
        hap = 0
    elif num[i] == "+":
        continue
    else:
        hap += num[i]
        if  i == len(num)-1:
            rs.append(hap)


rrs = rs[0]
if len(rs)== 1 : 
    print(rs[0])
else: 
    for i in range(1,len(rs)-1) :
        if rs[i] == "-" :
            rrs -= rs[i+1]
    print(rrs)
