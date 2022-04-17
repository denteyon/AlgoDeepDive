def findkthPermutation(n, k):
    result = []
    unused = list(range(1, n+1))
    factorials = [1] * (n+1)
    for i in range(1, n+1):
        factorials[i] = i * factorials[i-1]
    k -= 1
    while n > 0:
        part_length = factorials[n] // n # how many branches / 1234 -> 4
        i = k // part_length # which branch / 15 / 4 -> 2
        result.append(unused.pop(i))
        k = k % part_length # go down the branch / 15 % 4 -> 3
        n -= 1 # remove one unused
    return ''.join(map(str, result))