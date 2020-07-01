package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
    public void run() {
        distinguish();
    }

    void distinguish() {
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of 
        //      a thread as opposed to the start() method of a thread.

        System.out.println(
                "Process means any program is in execution. Process control block controls the operation of any process. Process control block contains the information about processes for example: Process priority, process id, process state, CPU, register etc. A process can creates other processes which are known as Child Processes. Process takes more time to terminate and it is isolated means it does not share memory with any other process.");
        System.out.println(
                "Thread is the segment of a process means a process can have multiple threads and these multiple threads are contained within a process. A thread have 3 states: running, ready, and blocked. Thread takes less time to terminate as compared to process and like process threads do not isolate.");
        System.out.println(
                "As we know that start() and run() are the two important methods of multithreading and one is used to create a new thread while other is used to start executing that thread.");
    }
}
