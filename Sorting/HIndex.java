public class HIndex {
    public static void main(String[] args) {
        int[] a = {3, 1, 0 , 9, 6};
        System.out.println(hIndex(a));
    }
    public static int hIndex(int[] citations) {
        int n = citations.length, tot=0;
        int[] arr = new int[n+1];
        for (int citation : citations) {
            if (citation >= n) arr[n]++;
            else arr[citation]++;
        }
        for (int i=n; i>=0; i--) {
            tot += arr[i];
            if (tot>=i) return i;
        }
        return 0;
    }
}
