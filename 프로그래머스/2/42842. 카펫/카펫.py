def solution(brown, yellow):
    total = brown + yellow 

    for x in range(3,total):
        if (total % x ) == 0 : 
            y = total // x
            if 2*(x+y) - 4 == brown:
                break                
        
    x,y = (max(x,y),min(x,y))
    answer = [x,y]
    return answer