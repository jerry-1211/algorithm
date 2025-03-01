def solution(N, number):
    answer = 0 
    dp = [set() for _ in range(9)]
    dp[1].add(N)
    
    if number == N : 
        return 1
    
    for p in range(2,9):
        dp[p].add(int(str(N) * p))
        
        for i in range(1,p):
            for x in dp[i] : 
                for y in dp[p-i]:
                    dp[p].add(x+y)
                    dp[p].add(x-y)
                    dp[p].add(x*y)
                    
                    if y != 0 :
                        dp[p].add(x//y)
            if number in dp[p]: 
                return p
        
    return -1