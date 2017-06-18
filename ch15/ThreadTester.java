class MyRunnable implements Runnable {
    public void run() {
        System.out.println("run() started");
        go();
        System.out.println("run() finished");
    }

    public void go() {
        System.out.println("go() started");
        doMore();
        System.out.println("go() finished");
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);

        System.out.println("calling thread.start()");

        myThread.start();

        System.out.println("back in main()");

        ThreadTester t = new ThreadTester();

        t.backInMain();

        System.out.println("backInMain() finished");
    }

    public void backInMain() {
        System.out.println("Method called from main()");
    }
}
