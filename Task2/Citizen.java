package Task2;

public class Citizen extends Person {
    private String city;

    public Citizen(String name, int age, String city) {
        super(name, age);
        this.city = city;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", City: " + city;
    }
}