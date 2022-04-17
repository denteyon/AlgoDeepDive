def anagram(s1, s2):
    if len(s1) != len(s2):
        return False
    s1_freq = {}
    for ch in s1:
        if ch in s1_freq:
            s1_freq[ch] += 1
        else:
            s1_freq[ch] = 1
    s2_freq = {}
    for ch in s2:
        if ch in s2_freq:
            s2_freq[ch] += 1
        else:
            s2_freq[ch] = 1
    for key in s1_freq:
        if s1_freq[key] != s2_freq[key]:
            return False
    return True
