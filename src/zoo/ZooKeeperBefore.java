package zoo;

public class ZooKeeperBefore {
    public void feed(Tiger tiger) {
        System.out.println("feed apple");
    }

    public void feed(Lion lion) {
        System.out.println("feed banana");
    }
    // 동물이 추가 될 때마다, feed() 메소드를 추가해야 한다.
}
