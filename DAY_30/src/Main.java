import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public int find_median(int[] v) {
        Arrays.sort(v);
        int n = v.length;
        if (n % 2 != 0) {
            return v[n / 2];
        } else {
            return (v[n / 2 - 1] + v[n / 2]) / 2;
        }
    }
}