package creational.builder;

/**
 * @author Seyyed Mahdiyar Zerehpoush
 */
public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder.of()
                .name("john", "doe")
                .age(10)
                .address("NY", "wall", "123456")
                .build();
        System.out.println(student);
    }
}
