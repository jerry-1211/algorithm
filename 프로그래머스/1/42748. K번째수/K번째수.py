def solution(array, commands):
    answer = []
    
    for i in range(len(commands)):
        start = commands[i][0]
        end = commands[i][1]
        idx = commands[i][2]
        
        tmp_lst = array[start-1:end] 
        tmp_lst.sort()
        answer.append(tmp_lst[idx-1])
        
        

    
    return answer