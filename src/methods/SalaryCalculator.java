package methods;

public class SalaryCalculator {
    public static void main(String[] args) {

        System.out.println(salary(45,40));


    }
    public static double salary(double hourlyRate,int weeklyHours){
        return hourlyRate * weeklyHours*52;
    }
}
