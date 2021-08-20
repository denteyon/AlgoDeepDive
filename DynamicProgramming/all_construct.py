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