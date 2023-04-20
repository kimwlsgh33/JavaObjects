package zoo;

public class ZooKeeper { // 중요 클래스 - 조련사
    /*
    * Predator 인터페이스를 구현한 클래스를 전부 매개변수로 받을 수 있다.
    * Predator가 수정되더라도, ZooKeeper는 수정할 필요가 없다.
    */
    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }

    // 동물이 추가 될 때마다, feed() 메소드를 추가할 필요가 없다!
}
