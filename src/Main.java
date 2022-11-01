import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Шувалова Агата Андреевна", "1", 15000);
        employees[1] = new Employee("Трошина Виктория Андреевна", "1", 17500);
        employees[2] = new Employee("Титова Маргарита Александровна", "2", 14300);
        employees[3] = new Employee("Семенова Алиса Ивановна", "2", 7000);
        employees[4] = new Employee("Юдина Виктория Константиновна", "3", 35000);
        employees[5] = new Employee("Фролов Елисей Романович", "3", 45000);
        employees[6] = new Employee("Шевцова Полина Денисовна", "4", 18900);
        employees[7] = new Employee("Мартынова Камилла Егоровна", "4", 21000);
        employees[8] = new Employee("Пономарева Милана Романовна", "5", 47000);
        employees[9] = new Employee("Смирнова Анастасия Богдановна", "5", 54000);

        System.out.println(Arrays.toString(employees));

        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sum + " рублей");

        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника " + minSalary + " рублей");

        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника " + maxSalary + " рублей");

        double averageOfSalary = sum / employees.length;
        System.out.println("Средняя зарплата сотрудника " + averageOfSalary + " рублей");


        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i] == null) continue;
            System.out.println(employee.getFullName());

        }
    }
}
