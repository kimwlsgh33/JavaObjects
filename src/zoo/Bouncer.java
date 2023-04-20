package zoo;

public class Bouncer { // 중요 클래스 - 경비원

    // Barkable 인터페이스를 구현한 클래스를 전부 매개변수로 받을 수 있다.
    public void barkAnimal(Barkable animal) {
      animal.bark();
    }
    // 동물이 추가 될 때마다, instanceof 를 사용한 조건문을 추가할 필요가 없다.
}
