public class Calculator {
    public static void main(String[] args) {

        // what you what to do? 1. add 2. sub 3. mul 4. div
        // 1
        // values please :1 2
        // 3
        // what you what to do?

        System.out.println(add(1, 2));
    }

    static int add(int a, int b) {
        return b + a;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }
}
