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

#Memoized
#time: O(n*m*m)
#space: O(m^2)


#Test Cases                      #Answers
print(bestsum(7, [5, 3, 4, 7]))  #[7]
print(bestsum(8, [2, 3, 5]))     #[3, 5]
print(bestsum(8, [1, 4, 5]))     #[4, 4]
print(bestsum(100, [1, 2, 5, 25])) #[25, 25, 25, 25]

def bestsum2(n, nums):
    if n == 0:
        return []
    if n < 0:
        return None

    table = [None]*(n+1)
    table[0] = []

    for index, value in enumerate(table):
        if value != None:
            for num in nums:
                if index+num <= n:
                    if table[index+num] == None or len(table[index+num]) > 1+len(table[index]):
                        table[index+num] = [*table[index], num]
    return table[n]

#Complexities are same as howSumTabulation
#Time: O(m*n*n) = O(m*n^2)
#Space: O(m^2)

#Test cases:
print(bestsum2(7, [5, 3, 4, 7]))  #[7]
print(bestsum2(8, [2, 3, 5]))     #[3, 5]
print(bestsum2(8, [1, 4, 5]))     #[4, 4]
print(bestsum2(100, [25, 1, 5, 2]))     #[25, 25, 25, 25]