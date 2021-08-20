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

print(countconstruct('purple', ['purp', 'p', 'ur', 'le', 'purpl']))