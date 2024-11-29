package String;

public class FirstWord {
    public static void main(String[] args) {
        String str = "Talk is cheap, show me the code";
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(str.indexOf("cheap"),str.lastIndexOf("show")));
        System.out.println(str.lastIndexOf("cheap"));


        System.out.println("==================================");

        String text = "\n\t\t c17o86de@19";
       String  text1 = text.replaceAll("[0-9]", "");
       String text2 = text1.replaceAll("[/t]", "");
      String text3= text2.replaceAll("@", "");
       System.out.println(text3);
    }
}
