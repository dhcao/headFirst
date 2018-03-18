package commandPattern.command;

import commandPattern.receiver.Light;

/**
 * Created by KEY on 2018/3/18.
 */
public class LightOnCommand implements Commend{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
