import java.util.*;

public class Solution {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        if (magazine.length < note.length) {
            System.out.println("No");
            return;
        }
        HashMap<String, Integer> hash = new HashMap();
        for (String mag: magazine) {
            if (!hash.containsKey(mag))
                hash.put(mag, 1);
            else {
                int count = hash.get(mag);
                hash.put(mag, count+1);
            }
        }
        for (String n: note) {
            if (!hash.containsKey(n)) {
                System.out.println("No");
                return;
            } else {
                int count = hash.get(n);
                if (count == 1)
                    hash.remove(n);
                else
                    hash.put(n, count-1);

            }
        }
        System.out.println("Yes");
        System.out.println("Testing Yes");
        System.out.println("Changes in test1 branchl");
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
