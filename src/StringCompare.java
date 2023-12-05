public class StringCompare {
    public static void main(String[] args) {
        String abc = "abc";
        String abc2 = new String("abc");
        System.out.printf("abc == abc2 ? %b%n",abc == abc2); // false
        System.out.printf("abc.equals(abc2) ? %b%n", abc.equals(abc2)); // true
    }
}
