import java.util.Objects;

public class Employee {
   private  String name;
   private  int department;
    private  double salary;
    static int counter = 1;
     private int id;

    public Employee(String name, int department, float salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public  String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return this.salary;
    }



    public  int getId() {
        return id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }


}
