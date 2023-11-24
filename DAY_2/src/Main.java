public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Pair
{
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
class Compute
{
    static Pair getMinMax(long a[], long n)
    {
        if (a == null || n == 0) {
            return new Pair(0, 0);
        }

        long min = a[0];
        long max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            }
        }

        return new Pair(min, max);
    }
}