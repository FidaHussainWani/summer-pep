import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        int temp = decimal;
        int octal = 0;
        int place = 1;

        while (temp != 0) {
            octal += (temp % 8) * place;
            temp /= 8;
            place *= 10;
        }

        assert octal >= 0 : "Invalid Octal Value";

        System.out.println("Octal = " + octal);

        sc.close();
    }
}