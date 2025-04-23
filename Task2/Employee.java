package Task2;

public class Employee extends Person {
    private String placeOfWork;
    private double salary;

    public Employee(String name, int age, String placeOfWork, double salary) {
        super(name, age);
        this.placeOfWork = placeOfWork;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Place of Work: " + placeOfWork + ", Salary: $" + salary;
    }
}