import java.util.Locale;

public class StringMethod {
    public static void main(String[]args){
        String a="Hello Java";
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(6));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0,5));
        String b="HelloJava";
        System.out.println(a.equals(b));
        System.out.println(b.indexOf("J"));
        System.out.println(a.replace("Hello","Welcome"));
        System.out.println(a+ " Programming");
        System.out.println(b.replace("o","a"));
        System.out.println(b.isEmpty());


    }
}
