def fib(n, memo={}):
    if n in memo:
        return memo[n]
    elif n <= 2:
        return 1
    else:
        memo[n] = fib(n-1, memo) + fib(n-2, memo)
        return memo[n]

def fib2(n):
    if n <= 2:
        return 1
    memo = [1]*n

    for i in range(2, n):
        memo[i] = memo[i-1] + memo[i-2]
    return memo[n-1]

print(fib2(8))