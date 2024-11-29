package String;

public class EachCharacter {
    public static void main(String[] args) {
        String str = "Cydeo";
        if (str == "" || str == null) {
            System.err.println("Error");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
