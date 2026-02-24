package week06;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(MathDemo.min(a, b));
        System.out.println(MathDemo.max(a, b));
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(MathDemo.sum(numbers));
        System.out.println(MathDemo.mean(numbers));
        System.out.println(MathDemo.factorial(5));
    }
}