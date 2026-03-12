
public class BinarySearch {
    static int binarySearchIterative(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            return binarySearchRecursive(arr, mid + 1, high, key);
        else
            return binarySearchRecursive(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12};

        System.out.println(binarySearchIterative(arr, 10));
        System.out.println(binarySearchRecursive(arr,0,arr.length-1,10));
    }
}