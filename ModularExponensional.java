public class ModularExponensional {
    public static long powerMod(long a, long b, long M) {
        long result = 1;
        a = a % M;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % M;
            }
            a = (a * a) % M;
            b = b >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        long a = 2;
        long b = 10;
        long M = 1000;

        System.out.println("Result: " + powerMod(a, b, M));
    }
}
