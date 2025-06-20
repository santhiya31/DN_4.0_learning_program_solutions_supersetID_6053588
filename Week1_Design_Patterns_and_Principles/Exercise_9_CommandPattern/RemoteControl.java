package Week1_Design_Patterns_and_Principles.Exercise_9_CommandPattern;

public class RemoteControl {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}

