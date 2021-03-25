package behavioral.state.state;


import behavioral.state.statemachine.StateMachine;

public interface State {
    void change(StateMachine dancer);
}
