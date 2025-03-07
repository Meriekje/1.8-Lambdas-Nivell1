package exercise8;

@FunctionalInterface
interface StringReverser {
    String reverse(String str);
}

public class Main {
    public static void main(String[] args) {
        StringReverser reverser = str -> new StringBuilder(str).reverse().toString();
        String result = reverser.reverse("hello");
        System.out.println("Reversed string: " + result);
    }
}