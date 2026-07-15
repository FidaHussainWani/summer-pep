public class SimpleAssertion {
    public static void main(String[] args) {

        int age = 20;

        assert age >= 18 : "Age must be 18 or above";

        System.out.println("Eligible for voting.");
    }
}