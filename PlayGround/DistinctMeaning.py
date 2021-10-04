import collections

class Solution:
    def numberOfDistinctMeanings(self, words):

        def isSimilar(word1, word2):
            if len(word2) - len(word1) != 1:
                return False
            for i in range(len(word1)):
                if word1[i] != word2[i]:
                    return word1[i:] == word2[i+1:]
            return True

        def markDfs(wi):
            visited.add(wi)
            for v in adj[wi]:
                if v not in visited:
                    markDfs(v)

        words.sort(key=len)
        n = len(words)
        adj = collections.defaultdict(list)
        visited = set()

        for i in range(n - 1):
            for j in range(i + 1, n):
                if isSimilar(words[i], words[j]):
                    adj[i].append(j)
                    adj[j].append(i)

        count = 0
        for i in range(n):
            if i not in visited:
                count += 1
                markDfs(i)
        return count


if __name__ == "__main__":
    s = Solution()
    # assert (
    print(s.numberOfDistinctMeanings(["caw", "caaw", "caww", "hoot", "hooot", "chirp"]))
    #     == 3
    # )
    # assert (
    print(s.numberOfDistinctMeanings(["raw", "rawo", "raow", "peet", "peaet"]))
        # == 2)

    print(s.numberOfDistinctMeanings(['a', 'abc', 'abd', 'abcd', 'abdc']))
    print("all tests ran successfully")
