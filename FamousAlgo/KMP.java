package FamousAlgo;

public class KMP {
    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        matchString(pat, txt);
    }
    public static void matchString(String pattern, String text) {
        int[] lps = new int[pattern.length()];

        computePattern(lps, pattern);

        int i = 0; // index for text
        int j = 0; // index for pattern
        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }
            if (j == pattern.length()) {
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];
            }

            // mismatch after j matches
            else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
    }

    public static  void computePattern(int[] lps, String pattern) {
        int len = pattern.length();
        int prefixLen = 0;
        int i = 1;
        lps[0] = 0;

        while (i < len) {
            if (pattern.charAt(i) == pattern.charAt(prefixLen)) {
                prefixLen++;
                lps[i] = prefixLen;
                i++;
                // (pat[i] != pat[prefixLen])
            } else {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (prefixLen != 0) {
                    prefixLen = lps[prefixLen - 1];

                    // Also, note that we do not increment
                    // i here
                    // if (prefixLen == 0)
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}
