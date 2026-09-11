import java.util.Scanner;

class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);

            System.out.println("Age: " + age);

            int result = 100 / (age - age);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
