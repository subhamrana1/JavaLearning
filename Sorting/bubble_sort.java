public class bubble_sort {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[min] < arr[j]) {
                    min = j;
                }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 1, 4, 2, 8 };
        bubble(arr);
        printr(arr);
        System.out.println("hello");
        System.out.println("shsbjcds");
}