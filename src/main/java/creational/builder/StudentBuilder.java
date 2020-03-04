package creational.builder;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class StudentBuilder {
    private Student student = new Student();


    public Student build() {
        return student;
    }

    public StudentBuilder of() {
        return this;
    }

    public StudentBuilder withName(String firstName, String lastName) {
        student.setFirstName(firstName);
        student.setLastName(lastName);
        return this;
    }

    public StudentBuilder withAge(Integer age) {
        student.setAge(age);
        return this;
    }

    public StudentBuilder withAddress(String city, String street, String zipCode) {
        Address address = new Address(city, street, zipCode);
        student.setAddress(address);
        return this;
    }
}
