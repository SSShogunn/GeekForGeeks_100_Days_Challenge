public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class GFG
{
    static double medianOfArrays(int n, int m, int a[], int b[])
    {
        if (n > m) {
            int[] temp = a;
            a = b;
            b = temp;

            int tempSize = n;
            n = m;
            m = tempSize;
        }

        int low = 0;
        int high = n;

        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = (n + m + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : a[partitionA - 1];
            int minRightA = (partitionA == n) ? Integer.MAX_VALUE : a[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : b[partitionB - 1];
            int minRightB = (partitionB == m) ? Integer.MAX_VALUE : b[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                high = partitionA - 1;
            } else {
                low = partitionA + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted!");
    }
}