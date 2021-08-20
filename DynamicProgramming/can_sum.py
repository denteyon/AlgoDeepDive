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

print(cansum(7, [2, 3])) #true
print(cansum(7, [5, 3, 4, 7])) #true
print(cansum(7, [2, 4])) #false
print(cansum(8, [2, 3, 5])) #true
print(cansum(300, [7, 14])) #false

def cansum2(n, nums):
    if n == 0:
        return True
    if n < 0:
        return False;
    
    table = [False]*(n+1)
    table[0] = True

    for index, val in enumerate(table):
        if val:
            for num in nums:
                if index + num <= n:
                    table[index+num] = True
    
    return table[n]

#Complexity
#m: targetSum
#n: length of array

#Time: O(m*n)
#Space: O(m)

print(cansum2(7, [2, 3]))        #true
print(cansum2(7, [5, 3, 4, 7]))  #true
print(cansum2(7, [2, 4]))        #false
print(cansum2(7, [2, 3, 5]))     #true
print(cansum2(300, [7, 14]))      #false