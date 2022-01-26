package com.globant.topic0;

import com.globant.topic0.exception.MemoryOverflowException;

import java.util.*;

public class Memory {
    private List<String> memory = new ArrayList<>();
    private final int MEMORY_LARGE = 200;
    private int count=1;

    public Memory(){
        for (int spaces = 1; spaces <= MEMORY_LARGE ; spaces++) {
            memory.add("****");
        }
    }
    public void memoryCheck(int positions) throws MemoryOverflowException {
        int freeSpaces=0;
        for (int i = 0; i <= MEMORY_LARGE-1; i++) {
            if(memory.get(i).equals("****")){
                freeSpaces++;
            }
        }
        if (positions > freeSpaces)
            throw new MemoryOverflowException("memory is full empty space is just: " + freeSpaces);
    }

    public void systemProcessCreator() throws MemoryOverflowException {
        Random randomClass = new Random();
        String processNumber = String.format("%03d",count);
        int largeSystem = randomClass.nextInt(5,16);
        memoryCheck(largeSystem);
        for (int i = 0; i <= MEMORY_LARGE - 1; i++) {
            if(memory.get(i).equals("****")){
                for (int j = i; j < (i+largeSystem); j++) {
                    memory.set(j,"s"+processNumber);
                }
                Collections.sort(memory);
                print();
                break;

            }

        }
        count++;
    }
    public void applicationProcessCreator() throws MemoryOverflowException {
        Random randomClass = new Random();
        String processNumber = String.format("%03d",count);
        int largeSystem = randomClass.nextInt(10,21);
        memoryCheck(largeSystem);
        for (int i = 0; i <= MEMORY_LARGE - 1; i++) {
            if(memory.get(i).equals("****")){
                for (int j = i; j < (i+largeSystem); j++) {
                    memory.set(j,"a"+processNumber);
                }
                Collections.sort(memory);
                print();
                break;
            }
        }
        count++;
    }

    public void processDelete(String processStrNumber){

        int processNumber;
        processStrNumber = processStrNumber.substring(1);
        processNumber = Integer.parseInt(processStrNumber);
        processStrNumber = String.format("%03d",processNumber);
        System.out.println(processStrNumber);
        for (int i = 0; i <= MEMORY_LARGE-1; i++) {
            if(memory.get(i).contains(processStrNumber)){
                memory.set(i,"****");
            }
        }
        Collections.sort(memory);
        print();
    }

    public void print(){
        for (int i = 0; i <= MEMORY_LARGE - 1; i++) {
            System.out.print(memory.get(i) + " ");
            if (((i + 1) % 10) == 0)
                System.out.println();
        }
        System.out.println();
    }

}
