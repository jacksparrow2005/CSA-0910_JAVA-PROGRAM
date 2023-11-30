import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = scanner.next().charAt(0);
        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();

        double bonus = 0;

        if (grade == 'A') {
            bonus = 0.05 * salary;
        } else if (grade == 'B') {
            bonus = 0.10 * salary;
        }
        if (salary < 10000) {
            bonus += 0.02 * salary;
        }
        double totalAmount = salary + bonus;
        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + totalAmount);

        scanner.close();
    }
}

OUTPUT:
Enter the grade of the employee (A/B): A
Enter the employee salary: 8000
Salary=8000.0
Bonus=560.0
Total to be paid:8560.0
