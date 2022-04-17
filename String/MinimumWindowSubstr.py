from collections import Counter

def findMinimumWindow(s, t):
    if not s or not t:
        return True
    n, m = len(s), len(t)
    if n < m:
        return False
    satisfied = 0
    start, end = 0, n
    freqt = Counter(t)
    freqs = Counter()
    left = 0

    for right in range(n):
        c = s[right]
        freqs[c] += 1
        if c in freqt and freqs[c] >= freqt[c]:
            satisfied += 1
        if satisfied == len(freqt):
            while s[left] not in freqt or freqt[s[left]] < freqs[s[left]]:
                freqs[s[left]] -= 1
                left += 1
            if end - start + 1 > right - left + 1:
                end, start = right, left
    return s[start:end+1] if end-start+1 <= n else ""