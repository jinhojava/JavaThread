package state;
//thread의 상태      Thread object가 생성은 되었지만, 실행은 되지 않은 상태를 말한다.new
public class StateExam01 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getState());
    }
}
