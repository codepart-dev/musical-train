public class JavaLitrals {
    public static void main(String[] args) {
        literals();
    }

    // code to demonstarae the use of literals in java
    public static void literals() {
        // integer literals
        int a = 101; // decimal form
        int b = 0100; // octal form
        int c = 0xFace; // hexadecimal form
        int d = 0b1111; // binary form
        
        System.out.println("Integer literals");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // floating point literals
        float e = 123.4f; // decimal form
        float f = 1.234e2f; // decimal form in exponential form
        double g = 123.4; // decimal form
        double h = 1.234e2; // decimal form in exponential form
        System.out.println("Floating point literals");
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // character literals
        char i = 'a'; // character literal
        char j = '\u0061'; // unicode form
        char k = 97; // integer form
        System.out.println("Character literals");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        // string literals
        String l = "Hello World"; // string literal
        System.out.println("String literals");
        System.out.println("l = " + l);

        // boolean literals
        boolean m = true; // boolean literal
        System.out.println("Boolean literals");
        System.out.println("m = " + m);
    }
}
