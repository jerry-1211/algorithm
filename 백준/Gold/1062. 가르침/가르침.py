from itertools import combinations
N,K = map(int,input().split())
left_word = K-5 

alphabet = set("antitaca")
newAlphabet = set()
words = []

for _ in range(N): 
  word = set(input())
  words.append(word)
  newAlphabet.update(word-alphabet) 


if left_word < 0  or K < 5:
  print(0)
  exit()

if len(newAlphabet) < left_word:
  left_word = len(newAlphabet)

mx = 0
for lst in combinations(newAlphabet,left_word):
  learned = alphabet | set(lst)
  word_count = sum(1 for word in words if set(word).issubset(learned)) 
  mx = max(mx,word_count)
print(mx)
    