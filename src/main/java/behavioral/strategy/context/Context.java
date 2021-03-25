package behavioral.strategy.context;

import behavioral.strategy.model.Person;
import behavioral.strategy.strategy.Marshaling;

public class Context {
    private Person person;

    public void marshal(Marshaling marshaling){
        marshaling.marshal(person);
    }



    public Context(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
