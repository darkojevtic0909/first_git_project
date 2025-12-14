package day02_practice;

public class SimpleCalculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(int a, int b){
        if (b == 0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return(double) a/b;
    }

    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("Add: " + add(x, y));
        System.out.println("Subtract: " + sub(x, y));
        System.out.println("Multiply: " + (x * y));
        System.out.println("Divide: " + divide(x, y));
        System.out.println("Test");
        System.out.println(divide(90, 4));
    }
}
