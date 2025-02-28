public class Main {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid input. Please provide a command followed by parameters.");
            System.exit(1);
        }

        String command = args[0];
        Calculator calculator = new Calculator();

        try {
            switch (command) {
                case "add":
                    if (args.length != 3) {
                        System.out.println("Usage: add <num1> <num2>");
                        break;
                    }
                    int sum = calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    System.out.println(sum);
                    break;

                case "subtract":
                    if (args.length != 3) {
                        System.out.println("Usage: subtract <num1> <num2>");
                        break;
                    }
                    int difference = calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    System.out.println(difference);
                    break;

                case "multiply":
                    if (args.length != 3) {
                        System.out.println("Usage: multiply <num1> <num2>");
                        break;
                    }
                    int product = calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    System.out.println(product);
                    break;

                case "divide":
                    if (args.length != 3) {
                        System.out.println("Usage: divide <num1> <num2>");
                        break;
                    }
                    int quotient = calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    System.out.println(quotient);
                    break;

                case "fibonacciNumberFinder":
                    if (args.length != 2) {
                        System.out.println("Usage: fibonacciNumberFinder <n>");
                        break;
                    }
                    int fibonacciNumber = calculator.fibonacciNumberFinder(Integer.parseInt(args[1]));
                    System.out.println(fibonacciNumber);
                    break;

                case "intToBinaryNumber":
                    if (args.length != 2) {
                        System.out.println("Usage: intToBinaryNumber <number>");
                        break;
                    }
                    String binary = calculator.intToBinaryNumber(Integer.parseInt(args[1]));
                    System.out.println(binary);
                    break;

                default:
                    System.out.println("Unknown command: " + command);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}