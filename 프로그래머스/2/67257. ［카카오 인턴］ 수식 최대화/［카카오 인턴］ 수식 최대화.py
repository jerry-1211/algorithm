from itertools import permutations

def solution(expression):
    answer = 0

    # 피연산자(operand) - 연산자(operator) 분리 
    operator = []
    lst_expression = list(expression)

    for idx,op in enumerate(lst_expression):
        if op in '+-*': 
            operator.append(op)
            lst_expression[idx] = " "
            
    operand = ("".join(lst_expression)).split(" ")
    operand = list(map(int,operand))

    for ops in permutations(["-","+","*"],3):
        operators = operator[:]
        operands = operand[:]
        
        
        for i in range(3):
            op = ops[i]
            while op in operators:
                k = operators.index(op)
                
                if op == "-":
                    operands[k] = operands[k] - operands[k+1]
                elif op == "+":
                    operands[k] = operands[k] + operands[k+1]
                elif op == "*":
                    operands[k] = operands[k] * operands[k+1]
                
                operands.pop(k+1)
                operators.pop(k)

        answer = max(answer,abs(operands[0]))  
    
    return answer