package zoo;

/* 추상 클래스 (abstract class)
 * 인터페이스 + 클래스
 * 단독으로 객체를 생성할 수 없다. ( new Predator() 불가능 )
 */
abstract class Predator extends Animal {

    // 추상 메소드 (abstract method) - 구현부가 없는 메소드
    // 추상 메서드를 포함한 클래스는, 반드시 추상 클래스여야 한다. ( 반대는 가능 )
    abstract String getFood();

    void printFood(){
        System.out.println("my food is " + getFood());
    }

    static int LEG_COUNT = 4; // 추상 클래스의 상수는, static 선언이 필요하다.
    static int speed(){
        return LEG_COUNT * 30;
    }
}
