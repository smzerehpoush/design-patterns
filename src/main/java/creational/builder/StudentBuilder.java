package creational.builder;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class StudentBuilder {
    private final Student student;

    public StudentBuilder() {
        student = new Student();
    }


    public Student build() {
        return student;
    }

    public StudentBuilder of() {
        return this;
    }

    public StudentBuilder name(String firstName, String lastName) {
        student.setFirstName(firstName);
        student.setLastName(lastName);
        return this;
    }

    public StudentBuilder age(Integer age) {
        student.setAge(age);
        return this;
    }

    public StudentBuilder address(String city, String street, String zipCode) {
        Address address = new Address(city, street, zipCode);
        student.setAddress(address);
        return this;
    }
}
