def travel_grid(m, n, memo={}):
    if (m,n) in memo:
        return memo[(m,n)]
    if (m, n) == (1, 1):
        return 1
    elif m == 0 or n == 0:
        return 0
    
    memo[(m,n)] = travel_grid(m, n-1, memo) + travel_grid(m-1, n, memo)
    return memo[(m,n)]

def travel_grid2(m, n, memo={}):
    if (m, n) == (1, 1):
        return 1
    elif m == 0 or n == 0:
        return 0
    table = [[0] * (n+1) for _ in range(m+1)]
    
    for i in range(1, m+1):
        for j in range(1,n+1):
            if i == 1 or j == 1:
                table[i][j] = 1
            else:
                table[i][j] = table[i-1][j] + table[i][j-1]
    return table[m][n]
    

print(travel_grid2(3,3))