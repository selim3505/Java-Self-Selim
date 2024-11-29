package String;

public class SubstringPositionFinder {
    public static void main(String[] args) {
        String str1 = "First, solve the problem. Then write teh code";
        String str2 = "java";
        boolean found = str1.contains(str2);
        if(found==false){
            System.out.println("not found");
        }
        System.out.println(str1.indexOf(str2));
        System.out.println("========================================");
        String word = "I love Java Programming";
        String name = word.substring(7);
        System.out.println(name);
        System.out.println(word.substring(7, 11));
        System.out.println(word.length());
        System.out.println(word);
    }




}
