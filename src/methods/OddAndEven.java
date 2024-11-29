package methods;

public class OddAndEven {
    public static void main(String[] args) {
        isOdd(-1);
    }
public static void isOdd(int num) {
        if (num<0){
            System.err.println();
            System.out.println("can not be assess");
            return;
        }
    if (num % 2 == 1) {
        System.out.println(num + ": is odd");
    }else
        System.out.println(num + ": is even");
}
}
