package main.java.com.concurrency;

public class Consumer extends Thread {

    private final LogProcessor processor;

    public Consumer(LogProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String log = processor.consumeLog();
                System.out.println("Consumed: " + log);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
