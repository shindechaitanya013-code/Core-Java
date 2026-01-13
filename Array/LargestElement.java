// Write a program to find the largest element in an array

class LargestElement {
    public static void main(String[] args) {
        int[] arr = {25, 10, 45, 30, 5};

        int max = arr[0];   

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element = " + max);
    }
}
