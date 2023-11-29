public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Compute {

    public void rotate(int[] arr, int n)
    {
        int lastElement = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }
}