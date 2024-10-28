import sys

N = int(input())
shortcut = []

# 첫 번쨰 단축키 지정
def first_shortcut(str_lst):
    state = 0 
    for i in range(len(str_lst)) : 
        if str_lst[i][0].lower() not in shortcut:
            shortcut.append(str_lst[i][0].lower())
            print_shortcut(str_lst,i,0) # 첫 위치 print
            state = 1 
            break

    if not(state):
        sequence_shorcut(str_lst)
    
    

def sequence_shorcut(str_lst):
    state = 0
    for i in range(len(str_lst)):
        for k in range(len(str_lst[i])):
            if str_lst[i][k].lower() not in shortcut:
                shortcut.append(str_lst[i][k].lower())
                print_shortcut(str_lst,i,k) # 첫 위치 print
                state = 1 
                return 
    
    if not(state):
        print(" ".join(str_lst), end =" ")
    



        
def print_shortcut(str_lst,i,k):
    str_lst[i] = str_lst[i][:k] + "[" + str_lst[i][k] + "]" + str_lst[i][k+1:]
    print(' '.join(str_lst), end=" ")



for _ in range(N):
    str_lst = input().split()
    first_shortcut(str_lst)
    print()
    
    





