package company.classes;

public class Process {
    private int id;
    private String name;
    private int priority;
    private int time;
    private int memory;
    private int timeIn;
    private int burstTime;
    private State state;
    private MemoryBlock memoryBlock;

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    int getPriority() {
        return priority;
    }

    public int getTime() {
        return time;
    }

    public int getMemory() {
        return memory;
    }

    public int getTimeIn() {
        return timeIn;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public State getState() {
        return state;
    }

    public MemoryBlock getMemoryBlock() {
        return memoryBlock;
    }

    public void setMemoryBlock(MemoryBlock memoryBlock) {
        this.memoryBlock = memoryBlock;
    }

    Process(int id) {
        this.id = id;
        this.memory = Utils.getRandomInteger(Configuration.OSMemoryVolume + 1, Configuration.memoryVolume / 2);
        this.priority = Utils.getRandomInteger(1, Configuration.maxPriority);
        this.time = Utils.getRandomInteger(10, 100);
        this.timeIn = ClockGenerator.getTime();
        this.burstTime = 0;
        this.name = "P" + this.id;
        this.state = State.Ready;
    }

    @Override
    public String toString() {
        return id +
                "{ name='" + name + '\'' +
                ", priority=" + priority +
                ", time=" + time +
                ", memory=" + memory +
                ", timeIn=" + timeIn +
                ", burstTime=" + burstTime +
                ", state=" + state +
                ", MemoryBlock=" + memoryBlock +
                '}';
    }
}


