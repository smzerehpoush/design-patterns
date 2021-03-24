package behavioral.strategy.strategy;

import behavioral.strategy.model.Person;

@FunctionalInterface
public interface Marshaling {
    void marshal(Person person);
}
