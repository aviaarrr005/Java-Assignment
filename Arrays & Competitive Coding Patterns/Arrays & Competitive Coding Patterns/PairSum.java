import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 1, 3, 6};
        int target = 8;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println(complement + " + " + num + " = " + target);
            }

            set.add(num);
        }
    }
}