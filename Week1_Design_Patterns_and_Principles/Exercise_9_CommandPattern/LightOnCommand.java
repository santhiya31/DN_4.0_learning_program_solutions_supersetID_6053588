package Week1_Design_Patterns_and_Principles.Exercise_9_CommandPattern;

public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOn();
    }
}
