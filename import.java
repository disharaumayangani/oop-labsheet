import java.util.Scanner;

public class Calculator {
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public double divide(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Command-Line Calculator!");
        System.out.println("Available operations: +, -, *, /");

        System.out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();

        double result;

        switch (operation) {
            case "+":
                result = calculator.add(n1, n2);
                break;
            case "-":
                result = calculator.subtract(n1, n2);
                break;
            case "*":
                result = calculator.multiply(n1, n2);
                break;
            case "/":
                try {
                    result = calculator.divide(n1, n2);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}