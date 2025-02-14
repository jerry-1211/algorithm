def solution(participant, completion):
    lst = {}
    for i in range(len(participant)):
        if lst.get(participant[i]) :
            lst[participant[i]] += 1
        else: 
            lst[participant[i]] = 1
            
    for j in range(len(completion)):
        lst[completion[j]] -= 1
    
    answer = []
    
    for key,value in lst.items():
        if value != 0 :
             return key



  
    
    
    
    