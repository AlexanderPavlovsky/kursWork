package company.classes;


public class RunningProcess extends Thread {
    private Process process;
    private int index;
    RunningProcess(Process process, int index){
        this.process = process;
        this.index = index;
    }
    @Override
    public void run() {
        process.setState(company.classes.State.Running);
        try {
            sleep(process.getTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        process.setBurstTime(ClockGenerator.getTime());
        process.setState(company.classes.State.Finished);
        Queue.addFinishedQueue(process);
        MemoryScheduler.releaseMemoryBlock(process.getMemoryBlock());
        RunningProcesses.runningProcessesIsFree.set(index, Boolean.TRUE);
    }
}
