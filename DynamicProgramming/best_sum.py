def bestsum(n, nums, memo={}):
    if n in memo:
        return memo[n]
    if n == 0:
        return []
    if n < 0:
        return None

    best_result = None

    for num in nums:
        combination_result = bestsum(n-num, nums)
        if combination_result != None:
            if best_result == None or len(best_result) > 1+len(combination_result):
                best_result = [*combination_result, num]
    memo[n] = best_result
    return memo[n]

print(bestsum(7, [5, 3, 4, 7]))