import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter commands (type 'exit' to quit):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length < 2) {
                System.out.println("Invalid command. Please enter a valid command followed by parameters.");
                continue;
            }

            String command = parts[0];

            try {
                switch (command) {
                    case "add":
                        if (parts.length != 3) {
                            System.out.println("Usage: add <num1> <num2>");
                            break;
                        }
                        int sum = calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(sum);
                        break;

                    case "subtract":
                        if (parts.length != 3) {
                            System.out.println("Usage: subtract <num1> <num2>");
                            break;
                        }
                        int difference = calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(difference);
                        break;

                    case "multiply":
                        if (parts.length != 3) {
                            System.out.println("Usage: multiply <num1> <num2>");
                            break;
                        }
                        int product = calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(product);
                        break;

                    case "divide":
                        if (parts.length != 3) {
                            System.out.println("Usage: divide <num1> <num2>");
                            break;
                        }
                        int quotient = calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                        System.out.println(quotient);
                        break;

                    case "fibonacciNumberFinder":
                        if (parts.length != 2) {
                            System.out.println("Usage: fibonacciNumberFinder <n>");
                            break;
                        }
                        int fibonacciNumber = calculator.fibonacciNumberFinder(Integer.parseInt(parts[1]));
                        System.out.println(fibonacciNumber);
                        break;

                    case "intToBinaryNumber":
                        if (parts.length != 2) {
                            System.out.println("Usage: intToBinaryNumber <number>");
                            break;
                        }
                        String binary = calculator.intToBinaryNumber(Integer.parseInt(parts[1]));
                        System.out.println(binary);
                        break;

                    default:
                        System.out.println("Unknown command: " + command);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format.");
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
