from itertools import permutations

def solution(numbers):
    answer = 0
    
    length = len(numbers)
    lst = list(numbers)
    prime =[0] * (10**length)
    prime[0],prime[1] = 1,1 
    
    for i in range(2,len(prime)):
        count = 3
        idx = i*2
        
        if prime[i] == 0 :
            while True :
                if idx < len(prime) -1 :
                    prime[idx] = 1 
                    idx = i*count
                    count += 1
                else : break
    
    permut_lst = set()
    for i in range(1,length+1): 
        if i == 1 :
            for k in lst:
                permut_lst.add(int(k))
        else:    
            for value in permutations(lst,i):
                value = int("".join(value))
                permut_lst.add(value)
    
    for i in permut_lst:
        if prime[i] == 0 :
            answer += 1 
            
            
    
    
    
    
    return answer