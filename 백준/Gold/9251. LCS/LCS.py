import sys

string2 = " " + input()
string1 = " " + input()

length1 = len(string1)
length2 = len(string2)
graph = [[0] * (length2) for _ in range(length1)]

for i in range(1,length1):
    for j in range(1,length2):
        if string1[i] != string2[j] : # string이 다른 경우
            graph[i][j] = max(graph[i-1][j],graph[i][j-1])
        else: # string이 같은 경우 
            graph[i][j] = graph[i-1][j-1] + 1

print(graph[-1][-1])