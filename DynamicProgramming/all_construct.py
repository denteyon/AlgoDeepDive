def allconstruct(target, word_bank, memo={}):
    if target in memo:
        return memo[target]
    if target == '':
        return [[]]
    
    result = []
    for word in word_bank:
        if target.startswith(word):
            suffix = target[len(word):]
            suffix_ways = allconstruct(suffix, word_bank, memo)
            target_ways = list(map(lambda list: [*list, word], suffix_ways))
            if len(target_ways) > 0:
                result.append([item for sublist in target_ways for item in sublist])
    memo[target] = result
    return result

print(allconstruct('purple', ['purp', 'p', 'ur', 'le', 'purpl']))
print(allconstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd', 'ef', 'c']));
print(allconstruct('skateboard', ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']))
print(allconstruct('aaaaaaaaaaaaaz', ['a', 'aa', 'aaa', 'aaaa', 'aaaaaaa']))
print(allconstruct('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefff',
                        ['e',
                        'ee',
                        'eee',
                        'eeee',
                        'eeeeee',
                        'eeeeeeee'])) #

def allconstruct2(target, word_bank):
    if target == '':
        return [[]]
    n = len(target)
    table = [None]*(n+1)
    table = list(map((lambda i: []), table)) #creating 2D array/ inserting a new array into every index replacing None
    table[0] = [[]]

    for index, value in enumerate(table):
        if len(value) > 0:
            for word in word_bank:
                jump = len(word)
                if index+jump <= n and target[index:index+jump] == word:
                    target_ways = list(map((lambda list: [*list, word]), table[index]))
                    if len(target_ways) > 0:
                        table[index+jump].extend(target_ways)
    return table[n]

print(allconstruct2('purple', ['purp', 'p', 'ur', 'le', 'purpl']))
print(allconstruct2('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd', 'ef', 'c']));
print(allconstruct2('skateboard', ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']))
print(allconstruct2('aaaaaaaaaaaaaz', ['a', 'aa', 'aaa', 'aaaa', 'aaaaaaa']))
#Since this program runs in exponential time therefore any test case with a large input wont execute quickly
# print(allconstruct2('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefff',
#                         ['e',
#                         'ee',
#                         'eee',
#                         'eeee',
#                         'eeeeee',
#                         'eeeeeeee'])) #