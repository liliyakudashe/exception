public class Example {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("Division by zero");
        }
        return a / b;
    }
}