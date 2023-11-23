public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Reverse
{
    public static String reverseWord(String s)
    {
        char[] charArray = s.toCharArray();
        int start = 0, end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}