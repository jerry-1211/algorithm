from collections import deque

def solution(bridge_length, weight, truck_weights):
    count = 0
    bridge = deque([0] * bridge_length)
    sum_truck = 0 
    
    for i in range(len(truck_weights)):
        while True:
            count += 1 
            pop_truck = bridge.popleft()
            
            if sum_truck - pop_truck + truck_weights[i] > weight:
                sum_truck -= pop_truck
                bridge.append(0)

            else: 
                sum_truck -= pop_truck
                bridge.append(truck_weights[i])
                sum_truck += truck_weights[i]
                break
    
    while True:
        count += 1 
        
        bridge.popleft()
        bridge.append(0)    

        if sum(bridge) == 0:    
            break
    
    
    return count