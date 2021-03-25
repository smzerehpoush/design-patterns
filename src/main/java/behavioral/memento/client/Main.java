package behavioral.memento.client;

import behavioral.memento.Caretaker;
import behavioral.memento.Person;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Person person = new Person("mahdi", "shojaei");
        caretaker.push(person.save());
        person.restore(caretaker.pop());

    }
}
