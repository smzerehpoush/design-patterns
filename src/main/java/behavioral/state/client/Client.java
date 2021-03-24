package behavioral.state.client;

import state.state.A;
import state.statemachine.StateMachine;

public class Client {
    public static void main(String[] args) {
        StateMachine stateMachine=new StateMachine(new A());

        for (int i = 0; i < 10; i++) {
            stateMachine.change();
        }
    }
}
