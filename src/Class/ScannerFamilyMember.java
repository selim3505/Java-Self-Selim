
import java.util.Scanner;

public class ScannerFamilyMember {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Family member: ");
        int people = input.nextInt();
        input.close();

        String result;
        if (people < 3) {
            result = "Family member low";
        } else if (people < 6) {
            result = "Family member medium";
        } else {
            result = "Family member high";
        }

        System.out.println(result);
    }
}
