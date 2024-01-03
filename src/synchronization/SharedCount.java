package synchronization;

public class SharedCount {

    int count;

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count =count;
    }

    public synchronized void increment(){
        setCount(getCount()+1);

    }
}
/*synchronized: 이 키워드는 다중 스레드 환경에서 공유 데이터에 대한 동기화를 제공합니다.
 특히, 한 스레드가 이 메서드를 실행하는 동안에는 다른 스레드가 동시에 실행할 수 없도록 합니다.
 메서드가 실행되는 동안 다른 스레드들은 동시에 이 메서드에 접근하지 못하도록 보장합니다.
 이것은 메서드 내의 코드 블록 전체에 대한 잠금을 설정하여 달성됩니다

 만약 static변수면 static메소드로 선언해주면 됩니다.
 */
