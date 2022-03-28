package EX3;

import java.util.Scanner;

/**
 * @author Pedro Simões (30007732@students.ual.pt);
 *         Gonçalo Lemos (30007523@students.ual.pt).
 */
public class FazCalculos2 {
    // Constructors
    public FazCalculos2() {
    }
    // Main Method
    public static void main(String[] args) {
        var Calculator = new Calculadora();
        final var Scanner = new Scanner(System.in);
        do {
            try {
                var C = new Calculadora();
                System.out.println("""
                        Choose an operation:
                        1. Sum
                        2. Subtract
                        3. Multiply
                        4. Divide
                        Answer:\s""");
                var op = Scanner.nextInt();
                if (op > 4 || op < 1) System.out.println("Invalid Option.");
                System.out.println("Enter 1º Value: ");
                double value1 = Scanner.nextDouble();
                System.out.println("Enter 2º Value: ");
                double value2 = Scanner.nextDouble();
                switch (op) {
                    case 1 -> System.out.println(value1 + " + " + value2 + " = " + C.Sum(value1, value2));
                    case 2 -> System.out.println(value1 + " - " + value2 + " = " + C.Subtract(value1, value2));
                    case 3 -> System.out.println(value1 + " * " + value2 + " = " + C.Multiply(value1, value2));
                    case 4 -> System.out.println(value1 + " / " + value2 + " = " + C.Divide(value1, value2));
                }
            } catch (Exception e) {
                System.out.println("Input Error: Try using a comma (',') instead of a dot ('.').");
                break;
            }
        } while(true);
    }
}
