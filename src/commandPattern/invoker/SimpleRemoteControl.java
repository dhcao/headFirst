package commandPattern.invoker;

import commandPattern.command.Commend;

/**
 * Created by KEY on 2018/3/18.
 */
public class SimpleRemoteControl {
    Commend slot;

    public void setSlot(Commend commend) {
        this.slot = commend;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
