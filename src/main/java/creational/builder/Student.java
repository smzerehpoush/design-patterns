package creational.builder;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", address=").append(address.toString());
        sb.append('}');
        return sb.toString();
    }
}
