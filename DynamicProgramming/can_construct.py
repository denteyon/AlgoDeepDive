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


print(canconstruct('abcdef', ['ab', 'abc', 'cd', 'def', 'abcd']))