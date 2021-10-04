def minDifferent(snacks):
    n = len(snacks)
    ans = n
    M = max(snacks)
    cnt = [0] * (M+1)

    for i in range(n):
        cnt[snacks[i]] = cnt[snacks[i]] + 1

    for d in range(2, M + 1):
        s = 0
        for i in range(M+1):
            if s<ans:
                s += cnt[i]*((d-(i%d))%d)
        ans = min(ans, s)
    
    return ans;

print(minDifferent([5, 10, 15, 20, 5]))