public class HayStack {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
    }
    public static int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();

        if(hLength==0 && nLength==0){
            return 0;
        } else if(haystack.equals(needle)){
            return 0;
        }

        for(int i=0;i<=hLength-nLength;i++){
            String haySub = haystack.substring(i, i+nLength);
            if(haySub.equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
