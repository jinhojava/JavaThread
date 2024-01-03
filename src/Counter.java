public class Counter extends Thread{

    String name;
    int count;
    int number;

    public Counter(String name, int count){
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

    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter("counter1",10);
        Counter counter2 = new Counter("counter2",10);
        counter1.start();
        counter2.start();                             //번갈아가며 출력, Thread를 사용하지않으면 하나끝나고 다음 것 실행
        //counter.join();                             //thread사용으로 멀티 쓰레드가능으로 동시실행
                                                      //start()를 호출해야만 멀티스레드로 병렬 처리가 가능해진다.
    }
}
