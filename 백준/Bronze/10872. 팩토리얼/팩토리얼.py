N =  int(input())

def reculsive(N): 
    global hap
        
    if N == 0 :
        print(hap) 
        return 
    
    hap *= N
    reculsive(N-1)
    

hap = 1
reculsive(N)
