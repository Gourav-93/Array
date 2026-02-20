
public class Reverse {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Orignal Array : ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println();
        System.out.println("Reversed Array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
