package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JobScheduler jobQueue = new JobScheduler();
        Process p = new Process("First job");
        Process x = new Process("middle job");
        Process y = new Process("last job");
        jobQueue.addProcess(p);
        jobQueue.addProcess(x);
        jobQueue.addProcess(y);
        System.out.println("Size = " + jobQueue.getSize());

        for(int i = 0; i < 1; i++)
        {
            System.out.println(jobQueue.getNextProcess());
        }
        Process newP = new Process("switch if empty return this job");
        System.out.println("Middle job returned and switch added");

        System.out.println(jobQueue.switchProcess(newP));

        for(int i = 0; i < 3; i++)
        {
            System.out.println(jobQueue.getNextProcess());
        }
    }
}
