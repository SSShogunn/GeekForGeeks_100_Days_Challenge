import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 2; i <= N; i++) {
            multiply(result, i);
        }

        return result;
    }

    static void multiply(ArrayList<Integer> result, int num) {
        int carry = 0;
        for (int i = 0; i < result.size(); i++) {
            int product = result.get(i) * num + carry;
            result.set(i, product % 10);
            carry = product / 10;
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }
    }
}