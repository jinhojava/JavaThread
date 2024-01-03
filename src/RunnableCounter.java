import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableCounter implements Runnable{
    String name;
    int count;
    int number;

    public RunnableCounter(String name, int count){
        this.name = name;
        this.count = count;

    }
    @Override
    public void run() {
        while(number<count){
            number++;
            System.out.println(name +":"+ number);
            try {
                Thread.sleep(1000);  //1초간의 딜레이를 준다.

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // RunnableCounter 클래스의 인스턴스 생성
        RunnableCounter myRunnableCounter = new RunnableCounter("runnableCounter", 5);
        RunnableCounter myRunnableCounter2 = new RunnableCounter("runnableCounter2", 5);

        ExecutorService pool = Executors.newFixedThreadPool(2);//서버수준에 따라 쓰레드개수조정

        pool.execute(myRunnableCounter);
        pool.execute(myRunnableCounter2);
    }
}