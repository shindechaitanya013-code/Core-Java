// Write a program to sort an array (Ascending order)

public class SortArray{
    public static void main(String args[]){
        int arr[] = {12, 5, 78, 8, 2};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
