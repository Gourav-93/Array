public class Second {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum Element Of The Array Is : " + min);
        System.out.println("Maximum Element Of The Array Is : " + max);
    }

}
