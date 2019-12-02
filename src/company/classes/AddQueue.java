package company.classes;

import java.util.Timer;
import java.util.TimerTask;

public class AddQueue extends TimerTask {
    private Timer timer = new Timer();
    @Override
    public void run() {
        timer.schedule(new AddQueue(), 100);
        ReadyQueue.addQueue();
    }
}
