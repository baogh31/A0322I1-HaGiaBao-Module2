package com.company;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - this.startTime;
    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
