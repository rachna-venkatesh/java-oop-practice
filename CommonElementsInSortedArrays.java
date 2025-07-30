public class CommonElementsInSortedArrays {

    public static void findCommonElements(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        System.out.println("Common elements are:");

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {3,5,6,8,9};
        int[] array2 = {2,3,4,6,7,8,8};

        findCommonElements(array1, array2);
    }
}
