package Week1_Design_Patterns_and_Principles.Exercise_9_CommandPattern;

public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOff();
    }
}
