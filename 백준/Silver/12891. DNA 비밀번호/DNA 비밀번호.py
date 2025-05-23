cnt = 0

P,S = map(int,input().split())
string = input()
a,c,g,t = map(int,input().split())
dna = {"A" : 0, "C" : 0, "G" : 0, "T" : 0}

for k in string[:S]:
    dna[k] += 1

if (dna["A"] >= a and dna["C"] >= c and dna["G"] >= g and dna["T"] >= t):
    cnt+=1

for i in range(P-S):
    dna[string[i]] -= 1
    dna[string[i+S]] += 1

    if (dna["A"] >= a and dna["C"] >= c and dna["G"] >= g and dna["T"] >= t):
        cnt += 1

print(cnt)
