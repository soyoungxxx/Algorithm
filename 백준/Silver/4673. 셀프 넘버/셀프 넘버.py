def solution(n) :
    ncpy = n

    while (ncpy > 0) :
        n += ncpy % 10
        ncpy //= 10

    return n

selfnum = []
num = []

for i in range (1, 10001) :
    selfnum.append(i)
    num.append(solution(i))


result = list(set(selfnum) - set(num))

result.sort(reverse=False)

for i in result :
    print(i)
