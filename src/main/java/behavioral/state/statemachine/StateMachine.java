package behavioral.state.statemachine;


import behavioral.state.state.State;

public class StateMachine {
    private State currentState;


    public StateMachine(State currentState) {
        this.currentState = currentState;
    }

    public void change() {
        currentState.change(this);
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
