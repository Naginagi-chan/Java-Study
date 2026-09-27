class FactorialTest {
    public static void main(String args[]) {
        System.out.println(factorial(8));
    }

    static long factorial(int n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }
}
