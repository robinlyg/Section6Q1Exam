package com.company;

public class JobScheduler  {
// To ensure that all applications in Operating System have equal CPU time a
//com.company.JobScheduler is needed. The job scheduler needs to maintain a list of jobs, and work
//with the OS to get the next job. The job scheduler serves the oldest job first while
//newer jobs wait for their turn to run. This means that the OS will call these methods
//and you only need to maintain data structure. What data structure will you use?
//Also, implement the following 3 methods and a constructor in legal Java code to
//your ability


    private CircularArrayQueue<Process> jobQueue;


    //constructor
    public JobScheduler(){
        jobQueue = new CircularArrayQueue<>();
    }

    public int getSize(){
        return jobQueue.size();
    }

    /* Adds a new job to the system.*/
    public void addProcess(Process p)
    {
        jobQueue.offer(p);

    }

    /* Gets the next job and adds this job back to the
system, if no other jobs exist this job is sent back.*/
    public Process switchProcess(Process p){
        //if no other job exist this job is sent back
        if(jobQueue.peek() == null)
            return p;
        //adds this to back of system
        jobQueue.offer(p);
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
