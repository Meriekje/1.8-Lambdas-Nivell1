package exercise5;

@FunctionalInterface
interface PiProvider {
    double getPiValue();
}

public class Main {
    public static void main(String[] args) {
        PiProvider piProvider = () -> 3.1415;
        System.out.println("Value of Pi: " + piProvider.getPiValue());
    }
}