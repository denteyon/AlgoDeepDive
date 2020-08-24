public class SparseSearch {
    public static void main(String[] args) {
        System.out.println(search(new String[]{"at", "", "ball", "", "", "car", "", "", "dad", "", "", "", "eat"}, "ball"));
    }
    public static int search(String[] arr, String s) {
        int result = -1;
        if (arr.length == 0 || s == null) {
            return result;
        }
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid].equals(s)) {
                return mid;
            } else if (!arr[mid].isEmpty()){
                if (arr[mid].compareTo(s) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                int res = findNearEle(mid, arr);
                if (res == -1) {
                    return result;
                } else if (arr[res].compareTo(s) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return result;
    }
    public static int findNearEle(int mid, String[] arr) {
        int left = mid;
        int right = mid;
        while (left >= 0 && right <= arr.length - 1) {
            if (!arr[left].isEmpty()) {
                return left;
            } else if (!arr[right].isEmpty()) {
                return right;
            } else {
                left--;
                right++;
            }
        }
        return -1;
    }
}
