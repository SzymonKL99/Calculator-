class Calculator {
    public static int adding(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        int sum = adding(number1, number2);
        int difference = subtraction(number1, number2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference );
    }
}