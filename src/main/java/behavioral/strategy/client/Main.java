package behavioral.strategy.client;

import behavioral.strategy.model.Person;
import behavioral.strategy.strategy.Json;
import behavioral.strategy.strategy.Xml;
import behavioral.strategy.context.Context;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Person("mahdi", "shojaei"));
        context.marshal(new Xml());
        context.marshal(new Json());
        context.marshal(person -> System.out.println(person.getName() + " " + person.getFamily()));
    }
}
