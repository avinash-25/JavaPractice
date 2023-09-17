class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target element
            } else if (arr[mid] < target) {
                start = mid + 1; // Target is in the right half
            } else {
                end = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,89};
        int val = 50;
        int num = binarySearch(arr,val);
        System.out.println("Returned value is : "+num);
    }
}