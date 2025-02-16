def solution(sizes):
    answer = 0
    w_max = 0
    h_max = 0
    
    for x,y in sizes:
        if x < y :
            tmp = x 
            x = y
            y = tmp
            
        w_max = max(w_max,x)
        h_max = max(h_max,y)
    
    answer = w_max*h_max
            
    
    return answer