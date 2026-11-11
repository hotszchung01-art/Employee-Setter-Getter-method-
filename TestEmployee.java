public class TestEmployee {
    public static void main(String s[]) {
        //1. Set the name and salary of emp1 to "CHAN Tai Man" and 12000.
        Employee emp1 = new Employee("Chan Tai Man", 12000);
        //2.	Set the name and salary of emp2 to "TAM Ping Shing" and 13500.
        Employee emp2 = new Employee("TAM Ping Shing", 13500);

        //3.	Print the details of emp1 and emp2.
        emp1.raiseSalary(5);
        emp2.raiseSalary(10);
        System.out.println("Employee 1" + emp1 ); // emp1.toString() || only the object emp1 also Ok
        System.out.println("Employee 2" + emp2.toString() );
    }
}
