package behavioral.memento;

import java.util.LinkedList;

public class Caretaker {
    private LinkedList<PersonMemento> history =new LinkedList<>();

    public void push(PersonMemento personMemento){
        history.push(personMemento);
    }

    public PersonMemento pop(){//میتونیم از دیگر کالکشن های دیگه هم استفاده کنیم  مثلا مپ بزاریم اینجا تو وروید کی بگیریم
        return history.pop();
    }
}
