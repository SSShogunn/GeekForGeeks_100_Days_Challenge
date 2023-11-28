import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution{
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> unionSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            unionSet.add(b[i]);
        }

        return unionSet.size();
    }
}