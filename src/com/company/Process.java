package com.company;

public class Process {
    private String job;

    public Process(String job){
        this.job = job;
    }

    @Override
    public String toString()
    {
        return job;
    }
}
