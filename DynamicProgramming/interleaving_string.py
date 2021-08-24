def is_interleave(first, second, result, memo={}):
    p1 = len(first)
    p2 = len(second)
    if (p1, p2) in memo:
        return memo[(p1, p2)]
    if result is None or result == '':
        return True
    if first is None or first == '':
        return second == result
    if second is None or second == '':
        return first == result
    # print(first, second, result)
    memo[(p1, p2)] = (first[0] == result[0] and is_interleave(first[1:], second, result[1:], memo)) or (second[0] == result[0] and is_interleave(first, second[1:], result[1:], memo))
    return memo[(p1, p2)]

print(is_interleave("XXXXXXXXXXY","XXXXXXXXXXZ","XXXXXXXXXXXXXXXXXXXXZY")) # true
print(is_interleave("YX","X","XXY")) # false
