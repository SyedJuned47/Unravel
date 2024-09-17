package main.java.com.concurrency;

public class Producer extends Thread {
    
    private final LogProcessor processor;

    public Producer(LogProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            processor.produceLog("Log " + i);
        }
    }
}
