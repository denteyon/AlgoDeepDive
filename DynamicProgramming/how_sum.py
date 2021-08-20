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


#time: O(n*m*m), the post multiplied 'm' is for list copying
#space: O(m*m), m keys, each key may have an array of m elements

print(howsum(7, [2, 3]))        #[3, 2, 2]
print(howsum(7, [5, 3, 4, 7]))  #[4, 3]
print(howsum(7, [2, 4]))        #None
print(howsum(8, [2, 3, 5]))     #[2, 2, 2, 2]
print(howsum(300, [7, 14]))     #None

def howsum2(n, nums):
    if n == 0:
        return []
    if n < 0:
        return None
    
    table = [None]*(n+1)
    table[0] = []

    for index, val in enumerate(table):
        if val != None:
            for num in nums:
                if index+num <= n:
                    table[index+num] = [*table[index], num]
    return table[n]


#Complexity
#m: targetSum
#n: length of array

#Time: O(m*n*m)
#Space: O(m*m)

print(howsum2(7, [2, 3]))        #[3, 2, 2]
print(howsum2(7, [5, 3, 4, 7]))  #[4, 3]
print(howsum2(7, [2, 4]))        #None
print(howsum2(8, [2, 3, 5]))     #[2, 2, 2, 2]
print(howsum2(300, [7, 14]))     #None