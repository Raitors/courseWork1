import java.io.OptionalDataException;

public class Main {
    public static void  writeListEmployee(Employee[] employees) {
        for (Employee all : employees) {
            System.out.println(all);
        }
    }
    public static double payAllMonth(Employee[] employees){
        double sum = 0;
        for (Employee value: employees) {
            sum += value.getSalary();
        }
        System.out.println("sum = " + sum);
        return sum;
    }
    public static void minSalary(Employee[] employees){
        Employee minSalary = employees[0];
        for (Employee value : employees){
            if (value.getSalary()< minSalary.getSalary()){
                minSalary = value;
            }
        }
        System.out.println(minSalary.getName());
    }
    public static void maxSalary(Employee[] employees){
        Employee maxSalary = employees[0];
        for (Employee value : employees){
            if (value.getSalary()> maxSalary.getSalary()){
                maxSalary = value;
            }
        }
        System.out.println(maxSalary.getName());
    }
    public static double averagePay(Employee[] employees) {
        double average = 0;
        for (Employee value: employees) {
            average += value.getSalary()/employees.length;
        }
        System.out.println("sum = " + average);
        return  average;
    }
    public static void nameEmployee(Employee[] employees) {
        for (int i = 1; i < employees.length + 1; i++) {
        System.out.println(employees[i - 1].getName());
        }
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Киселёва Алевтина Пётровна", 2, 58630);
        employee[1] = new Employee("Лебедев Прохор Проклович", 5, 60638);
        employee[2] = new Employee("Титова Алика Дмитрьевна", 3, 41131);
        employee[3] = new Employee("Исаев Роберт Альвианович", 4, 52350);
        employee[4] = new Employee("Горшкова Анфиса Гордеевна", 1, 42602);
        employee[5] = new Employee("Мельников Авраам Протасьевич", 2, 71802);
        employee[6] = new Employee("Кузнецова Эрика Робертовна", 4, 48989);
        employee[7] = new Employee("Щукин Георгий Лукьянович", 5, 59592);
        employee[8] = new Employee("Зыкова Эдуарда Николаевна", 3, 79105);
        employee[9] = new Employee("Горбунов Николай Павлович", 1, 72039);
//Получить список всех сотрудников со всеми имеющимися по ним данными
        writeListEmployee(employee);
//Получить список всех сотрудников со всеми имеющимися по ним данными
        payAllMonth(employee);
//Найти сотрудника с минимальной зарплатой
        minSalary(employee);
//Найти сотрудника с минимальной зарплатой
        maxSalary(employee);
//Подсчитать среднее значение зарплат
        averagePay(employee);
//Ф. И. О. всех сотрудников
        nameEmployee(employee);
    }
}