package Task2;

public class Student extends Person {
    private String speciality;
    private String university;
    private double averageMarks;

    public Student(String name, int age, String speciality, String university, double averageMarks) {
        super(name, age);
        this.speciality = speciality;
        this.university = university;
        this.averageMarks = averageMarks;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Speciality: " + speciality + ", University: " + university + ", Average Marks: " + averageMarks;
    }
}