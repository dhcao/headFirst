package commandPattern.client;

import commandPattern.command.LightOnCommand;
import commandPattern.invoker.SimpleRemoteControl;
import commandPattern.receiver.Light;

/**
 * Created by KEY on 2018/3/18.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setSlot(lightOnCommand);
        remote.buttonWasPressed();
    }
}
