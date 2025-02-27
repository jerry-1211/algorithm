def solution(m, n, puddles):
    dp = [[0] * m for _ in range(n)]
    
    # puddles 설정
    for j,i in puddles :
        dp[i-1][j-1] = -1
    

    
    dp[0][0] = 1
    
    # 첫 번째 열 초기화 (웅덩이 이후는 0)
    for i in range(1, n):
        if dp[i][0] == -1:
            dp[i][0] = 0  # 웅덩이면 이후는 전부 0
        else:
            dp[i][0] = dp[i-1][0]
    
    # 첫 번째 행 초기화 (웅덩이 이후는 0)
    for j in range(1, m):
        if dp[0][j] == -1:
            dp[0][j] = 0  # 웅덩이면 이후는 전부 0
        else:
            dp[0][j] = dp[0][j-1]
    
        
    for i in range(1,n):
        for j in range(1,m):
            
            if dp[i][j] == -1 : 
                dp[i][j] = 0
                continue 
                
            
            dp[i][j] = (dp[i][j-1]  + dp[i-1][j])% 1000000007
                
        
    answer = dp[-1][-1]
    
    return answer