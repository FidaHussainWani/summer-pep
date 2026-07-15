import java.util.Scanner;

public class IntegerAssertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            assert num == (int) num : "Not an integer";

            System.out.println("Valid Integer: " + num);
        } else {
            assert false : "Input is not an integer";
        }

        sc.close();
    }
}
