package Pratice.JdbcSpring.configcalss;

public class Employee {
    private int id;
    private String name;
     private String Designation;
     private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String designation, long salary) {
        this.id = id;
        this.name = name;
        Designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Designation='" + Designation + '\'' +
                ", salary=" + salary +
                '}';
    }
    public Employee(){super();}
}
