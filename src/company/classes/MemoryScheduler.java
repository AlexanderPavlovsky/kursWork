package company.classes;

import java.util.ArrayList;

public class MemoryScheduler {
    private static ArrayList<MemoryBlock> memoryBlocks = new ArrayList<>();

    public static String print() {
        String result = "[ ";
        for (MemoryBlock memoryBlock : memoryBlocks) {
            result += memoryBlock + " ";
        }
        return result + " ]";
    }

    private static int findFreeBlock(int size) {

        System.out.println(print());
        memoryBlocks.sort(MemoryBlock.byEnd);
        System.out.println(print());
        ArrayList<MemoryBlock> tempMemoryBlocks = new ArrayList<>();
        for (int i = 0; i < memoryBlocks.size() - 1; i++) {
            if (memoryBlocks.get(i + 1).start - memoryBlocks.get(i).end > size) {
                MemoryBlock tempMemoryBlock = new MemoryBlock(memoryBlocks.get(i).end, memoryBlocks.get(i + 1).start);
                tempMemoryBlocks.add(tempMemoryBlock);
                System.out.println(tempMemoryBlock);
            }
        }

        return 0;
    }

    public static boolean fillMemoryBlock(int size) {
        findFreeBlock(size);
        return false;
    }

    public void releaseMemoryBlock(MemoryBlock memoryBlock) {
        memoryBlocks.remove(memoryBlock);
    }

    public static void add(MemoryBlock memoryBlock) {
        memoryBlocks.add(memoryBlock);
    }
}
