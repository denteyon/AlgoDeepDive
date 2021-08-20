def howsum(n, nums, memo={}):
    if n in memo:
        return memo[n]
    if n == 0:
        return []
    if n < 0:
        return None

    for num in nums:
        combination_result = howsum(n-num, nums)
        if combination_result != None:
            # new_list = combination_result.copy()
            # new_list.append(num)
            # return new_list
            memo[n] = [*combination_result, num]
            return memo[n]
    memo[n] = combination_result
    return memo[n]

print(howsum(7, [5, 3, 4, 7]))