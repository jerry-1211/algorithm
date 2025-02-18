from itertools import permutations 

def solution(k, dungeons):
    length = len(dungeons)
    total = list(permutations(dungeons,length))
    answer = 0
    mx = 0 
    tmp = k 
    
    for lst in total :
        mx = max(mx,answer)
        answer = 0
        k = tmp

        for m_energy, s_energy in lst:
            if k >= m_energy:
                k -= s_energy
                answer += 1 
            else : 
                continue
    
    
    return mx