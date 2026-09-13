public class Recursividad {

    // 1. Factorial de un número
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 2. Serie de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 3. Suma de dígitos de un número
    public static int sumaDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Fibonacci en posición 6: " + fibonacci(6));
        System.out.println("Suma de dígitos de 1234: " + sumaDigitos(1234));
    }
}
