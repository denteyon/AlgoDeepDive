def cansum(n, nums, memo={}):
    if n in memo:
        return memo[n]
    if n == 0:
        return True
    if n < 0:
        return False
    for num in nums:
        if cansum(n-num, nums, memo):
            memo[n-num] = True
            return True
    memo[n-num] = False
    return False

# def cansum2(n, nums):



print(cansum(7, [5, 3, 4, 7]))