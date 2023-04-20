package zoo;

public class BouncerBefore { // 중요 클래스 - 경비원
    public void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) { // 입력받은 animal 객체가, Tiger 클래스의 인스턴스인지 확인
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
            System.out.println("으르렁");
        } else {
            System.out.println("...?");
        }
    }
    // 동물이 추가 될 때마다, instanceof 를 사용한 조건문을 추가해야 한다.
}
