def solution(answers):
    answer = []
    
    supoza1 = [1,2,3,4,5]
    supoza2 = [2,1,2,3,2,4,2,5]
    supoza3 = [3,3,1,1,2,2,4,4,5,5]
    
    len_supoza1 = len(supoza1)
    len_supoza2 = len(supoza2)
    len_supoza3 = len(supoza3)
    
    cnt_supoza1 = 0
    cnt_supoza2 = 0
    cnt_supoza3 = 0
    
    for i in range(len(answers)):
        if answers[i] == supoza1[i%len_supoza1]:
            cnt_supoza1 += 1
        if answers[i] == supoza2[i%len_supoza2]:
            cnt_supoza2 += 1
        if answers[i] == supoza3[i%len_supoza3]:
            cnt_supoza3 += 1
    
    
    lst = [0,cnt_supoza1,cnt_supoza2,cnt_supoza3]
    mx = max(lst)
    
    for i in range(len(lst)):
        if mx == lst[i] :
            answer.append(i)
    
    
    return answer