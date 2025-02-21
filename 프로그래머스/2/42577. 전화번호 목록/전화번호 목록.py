def solution(phone_book):
    answer = True
    hash = {}
    
    for n in phone_book: 
        hash[n] = 1
        
    for number in phone_book:
        tmp = ""
        for i in range(len(number)):
            tmp += number[i]
            if tmp in hash.keys() and tmp != number: 
                return False
    

    
    return answer