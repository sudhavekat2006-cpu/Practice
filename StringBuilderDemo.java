public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb+" Java Programming.");
        System.out.println(sb.reverse());

        System.out.println(sb.length());

        System.out.println(sb.insert(5,"Java"));
        System.out.println(sb);
        System.out.println(sb.delete(5,10));
        System.out.println(sb.reverse());
        System.out.println(sb.length());

    }
}
