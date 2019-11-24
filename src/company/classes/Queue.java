package company.classes;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Process> queue;
    private int lastID;
    Queue rejectedQueue;

    public int getLastID() {
        return lastID;
    }

    public Queue() {
        this.queue = new ArrayList<>();
        this.lastID = 1;
        this.rejectedQueue  = new Queue();
    }
    public void add(Process process) {
        this.rejectedQueue.add(process);
    }

    public boolean add() {
        Process process = new Process(this.lastID++);
       if(!this.queue.add(process)){
           this.rejectedQueue.add(process);
       }
        return  false;
    }

    public void add(final int N) {
        for (int i = 0; i < N; i++) {
            this.add();
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(Process process:queue){
            result += process + "\n";
        }
        return result;
    }
}
