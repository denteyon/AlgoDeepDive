def countconstruct(target, word_bank, memo={}):
    if target in memo:
        return memo[target]
    if target == '':
        return 1
    
    total_count = 0
    for word in word_bank:
        if target.startswith(word):
            suffix = target[len(word):]
            result_count = countconstruct(suffix, word_bank, memo)
            total_count += result_count
    memo[target] = total_count
    return total_count

print(countconstruct('purple', ['purp', 'p', 'ur', 'le', 'purpl'])) #2
print(countconstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd'])) #1
print(countconstruct('skateboard', ['bo', 'rd', 'ate','t', 'ska', 'sk', 'boar'])) #0
print(countconstruct('enterapotentpot', ['a', 'p', 'ent', 'enter', 'ot', 'o', 't'])) #4
print(countconstruct('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefff',
                        ['e',
                        'ee',
                        'eee',
                        'eeee',
                        'eeeeee',
                        'eeeeeeee'])) #0, too slow for just brute force

def countconstruct2(target, word_bank):
    if target == '':
        return 1

    n = len(target)
    table = [0]*(n+1)
    table[0] = 1

    for index, value in enumerate(target):
        if value != 0:
            for word in word_bank:
                jump = len(word)
                if index+jump <= n and target[index:index+jump] == word:
                    table[index+jump] += table[index]
    return table[n]

print(countconstruct2('purple', ['purp', 'p', 'ur', 'le', 'purpl'])) #2
print(countconstruct2('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd'])) #1
print(countconstruct2('skateboard', ['bo', 'rd', 'ate','t', 'ska', 'sk', 'boar'])) #0
print(countconstruct2('enterapotentpot', ['a', 'p', 'ent', 'enter', 'ot', 'o', 't'])) #4
print(countconstruct2('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefff',
                        ['e',
                        'ee',
                        'eee',
                        'eeee',
                        'eeeeee',
                        'eeeeeeee'])) #0, too slow for just brute force