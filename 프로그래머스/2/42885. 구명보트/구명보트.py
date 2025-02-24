def solution(people, limit):
    people.sort()
    answer = 0
    
    S = 0
    E = len(people) - 1 
    
    print(people)
    while S <= E :
        
        if limit >= people[S] + people[E] :
            S += 1 
            E -= 1 
            answer += 1
            
        else : 
            E -= 1 
            answer += 1 
            
    
    return answer