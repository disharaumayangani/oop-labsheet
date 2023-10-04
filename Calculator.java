public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}
class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5, 10);
        int sum2 = calculator.add(5, 10, 15);
        double sum3 = calculator.add(2.5, 3.7);
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
