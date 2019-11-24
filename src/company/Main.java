package company;

import company.classes.MemoryBlock;
import company.classes.MemoryScheduler;
import company.classes.Process;
import company.classes.Queue;

public class Main {

    public static void main(String[] args) {
//        Process process = new Process(1);
//        System.out.println(process);

        MemoryScheduler.add(new MemoryBlock(0, 100));
        MemoryScheduler.add(new MemoryBlock(1000, 1100));
        MemoryScheduler.add(new MemoryBlock(500, 800));
        MemoryScheduler.add(new MemoryBlock(250, 450));
        MemoryScheduler.fillMemoryBlock(100);

//        Queue queue = new Queue();
//        queue.add(5);
//        System.out.println(queue);
    }
}
