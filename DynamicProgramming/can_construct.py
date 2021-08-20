def canconstruct(target, word_bank, memo={}):
    if target in memo:
        return True
    if target == '':
        return True
    for word in word_bank:
        if target.startswith(word):
            suffix = target[len(word):]
            if canconstruct(suffix, word_bank, memo):
                memo[target] = True
                return True
    memo[target] = False
    return False

#Memoized
#Time: O(n*m*m) = O(n*m^2)
#Space: O(m^2)


print(canconstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd'])); #true
print(canconstruct('skateboard', ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar'])) #false
#memoization test case
print(canconstruct('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefff',
                        ['e',
                        'ee',
                        'eee',
                        'eeee',
                        'eeeeee',
                        'eeeeeeee'])) #false

def canconstruct2(target, word_bank):
    if target == '':
        return True

    n = len(target)
    table = [False]*(n + 1)
    table[0] = True

    for index, value in enumerate(table):
        if value:
            for word in word_bank:
                jump = len(word)
                if index+jump <= n and target[index:index+jump] == word:
                    table[index+jump] = True
    return table[n]



#Time: O(m*n*m) // the last 'm' is for slicing/copying of the array
#Space: O(m)

print(canconstruct2('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd'])); #true
print(canconstruct2('skateboard', ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar'])) #false
print(canconstruct2('enterapotentpot', ['a', 'p', 'ent', 'enter', 'ot', 'o', 't'])) #true
print(canconstruct2('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefff',
                        ['e',
                        'ee',
                        'eee',
                        'eeee',
                        'eeeeee',
                        'eeeeeeee'])) #false
