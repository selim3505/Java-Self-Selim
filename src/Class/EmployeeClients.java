package Class;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Selim";
        employee1.age =41;
        employee1.gender ='M';
        employee1.jobTitle = "Sdet";
        employee1.salary = 2500;

        Employee employee2 = new Employee();
        employee2.name = "Rıza";
        employee2.age =42;
        employee2.gender ='M';
        employee2.jobTitle = "Tester";
        employee2.salary = 1500;


        employee1.work();
        System.out.println(employee1);
        System.out.println(employee2);

    }







}
