package wait_notify;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
    private Data data;

    public Sender(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        String packets[] = {
                "First packet",
                "second packet",
                "Third packet",
                "Fourth packet",
                "End"
        };

        for(String packet : packets){
            data.send(packet);

            try{
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
    }
}
