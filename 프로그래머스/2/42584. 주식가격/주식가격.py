def solution(prices):
    answer = [0] * len(prices)
    stack = []
    
    for idx,value in enumerate(prices):
        while stack and stack[-1][1] > value:
            print(1)
            k, _ = stack.pop()
            answer[k] = idx -k 

        stack.append((idx,value))
       
    while stack:
        idx,_ = stack.pop()
        answer[idx] = len(prices) - idx - 1
        
    return answer