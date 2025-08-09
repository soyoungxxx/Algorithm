from itertools import combinations

def solution(n, q, ans):
    answer = 0
    
    arr = list(range(1, n+1))
    
    for arrComb in combinations(arr, 5) :
        i = 0
        flag = True
        for ansCount in ans :
            count = len(set(arrComb) & set(q[i]))
            if (count != ansCount) :
                flag = False
                break
            i += 1
        if (flag) :
            answer += 1
    return answer