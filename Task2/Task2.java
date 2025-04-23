package Task2;

public class Task2 {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("Oleg", 25),
                new Citizen("Maria", 30, "Kyiv"),
                new Student("Ivan", 20, "Computer Science", "KHPI", 4.5),
                new Employee("Anna", 35, "Tech Corp", 50000.0),
                new Citizen("Petro", 45, "Lviv"),
                new Student("Olena", 19, "Mathematics", "KNU", 4.8)
        };

        System.out.println("Testing object information output:");
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person " + (i + 1) + ": " + people[i].getInfo());
        }

        System.out.println("\nTesting object types:");
        for (Person person : people) {
            String type = switch (person) {
                case Citizen c -> "Citizen";
                case Student s -> "Student";
                case Employee e -> "Employee";
                default -> "Person";
            };
            System.out.println("Person " + person.getInfo() + " is of type: " + type);
        }
    }
}