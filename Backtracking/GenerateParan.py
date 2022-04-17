def generateParantheses(n):
    if n <= 0:
        return []
    result = []
    backTrack(0, 2*n, 0, 0, "", result)
    return result

def backTrack(index, n, open, closed, current, result):
    if index >= n:
        result.append(current)
        return
    if open < n // 2:
        backTrack(index + 1, n, open + 1, closed, current + '(', result)
    if closed < open:
        backTrack(index + 1, n, open, closed + 1, current + ')', result)
    
print(generateParantheses(3))