package zoo;

// 호랑이는, 동물이다(is), 포식한다 (do), 짖는다 (do)
// 하나의 객체(Tiger)가 여러 인터페이스를 구현할 수 있다. (다중 상속)
// 다형성 : 하나의 객체가 여러 타입(Animal, Predator, Barkable)을 가질 수 있다.
//public class Tiger extends Animal implements Predator, Barkable {
public class Tiger extends Predator implements Barkable {
    @Override
    public String getFood() {
        return "apple";
    }

    @Override
    public void bark() {
        System.out.println("어흥");
    }
}
