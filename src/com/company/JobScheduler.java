package com.company;

import java.awt.*;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class JobScheduler  {
// To ensure that all applications in Operating System have equal CPU time a
//com.company.JobScheduler is needed. The job scheduler needs to maintain a list of jobs, and work
//with the OS to get the next job. The job scheduler serves the oldest job first while
//newer jobs wait for their turn to run. This means that the OS will call these methods
//and you only need to maintain data structure. What data structure will you use?
//Also, implement the following 3 methods and a constructor in legal Java code to
//your ability

    //if i use a dll as my
    //data structure to use

    private LinkedList<Process> jobQueue = new LinkedList();
    //private int size = 0;

    //constructor
    public JobScheduler(){
        jobQueue = new LinkedList<>();
    }


    public int getSize(){return jobQueue.size();}
    /* Adds a new job to the system.*/
    public void addProcess(Process p)
    {
        jobQueue.offer(p);
        //size++;
    }

    /* Gets the next job and adds this job back to the
system, if no other jobs exist this job is sent back.*/
    public Process switchProcess(Process p){
        //if no other job exist this job is sent back
        if(jobQueue.peek() == null)
            return p;
        //adds this to back of system
        jobQueue.offerLast(p);
        //gets next job
        return jobQueue.poll();

    }


    /* The previous job finished so we call this to get the
next process, if no other jobs exist return null */
    public Process getNextProcess(){
        if(jobQueue.size() == 0)
            return null;
       // size--;
        return jobQueue.poll();
    }



}
