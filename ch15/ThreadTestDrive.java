class MyRunnable1 implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTestDrive {
    public static void main(String[] args) {
        Runnable theJob = new MyRunnable1();
        Thread t = new Thread(theJob);

        System.out.println("calling thread.start()");
        t.start();
        System.out.println("back in main");
    }
}
