package String;

public class equals {
    public static void main(String[] args) {
        String str = " java";
        String str2 = " java";
        String str3 = new String("java");
        String str4 = new String("Java");
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));
        System.out.println(str.equals(str4));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println("str.equalsIgnoreCase(str4) = " + str.equalsIgnoreCase(str4));

    }
}
