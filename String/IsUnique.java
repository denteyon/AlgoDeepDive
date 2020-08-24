package ctci;

public class IsUnique {
    public static boolean unique(String str) {
        boolean[] all = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i);
            if (all[a]) {
                return false;
            }
            all[a] = true;
        }
        return true;
    }
}
