public class EvenIndexEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 1, 5, 8};

        int evenIndex = 0;
        int oddIndex = 1;
        int n = arr.length;

        while (evenIndex < n && oddIndex < n) {
            if (arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            } else if (arr[oddIndex] % 2 != 0) {
                oddIndex += 2;
            } else {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;

                evenIndex += 2;
                oddIndex += 2;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}