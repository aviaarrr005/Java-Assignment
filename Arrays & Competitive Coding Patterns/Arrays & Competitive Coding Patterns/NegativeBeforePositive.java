public class NegativeBeforePositive {
    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -1, 6, -3, 2, -4};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}