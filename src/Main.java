import cal.Calculator;
import cal.MaxLimitCalculator;
import cal.UpgradeCalculator;
import coffee.CoffeeType;
import mine.Bronze;
import mine.Gold;
import mine.MineralCalculator;
import mine.Silver;
import zoo.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        quest5();
//        quest4NE();
    }

    static void test1() {
        Animal cat = new Animal(); // 객체 생성
        // cat 객체는, Animal 클래스의 인스턴스이다.

        Dog dog = new Dog();
        dog.setName("puppy"); // Dog 클래스는 Animal 클래스를 상속받았기 때문에, Animal 클래스의 메소드를 사용할 수 있다.
        System.out.println(dog.name);
        dog.sleep();

        Animal dog2 = new Dog(); // Animal 클래스의 인스턴스는, Dog 클래스의 인스턴스를 가리킬 수 있다.
        // Animal 자료형으로 사용하면, Animal 클래스의 메소드만 사용할 수 있다.
        // dog2.sleep(); // Animal 클래스에는 sleep() 메소드가 없기 때문에, 컴파일 에러가 발생한다.
        // Dog dog3 = new Animal(); // 모든 동물이 개는 아니기 때문에, Dog 클래스의 인스턴스는 Animal 클래스의 인스턴스를 가리킬 수 없다.

        HouseDog houseDog = new HouseDog("happy");
        houseDog.sleep();
        houseDog.sleep(3);
        HouseDog yorkshire = new HouseDog(1);
        yorkshire.sleep(5);
    }

    static void test2() {
        ZooKeeperBefore zooKeeperBefore = new ZooKeeperBefore();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeperBefore.feed(tiger);
        zooKeeperBefore.feed(lion);

        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }

    static void test3() {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        BouncerBefore bouncerBefore = new BouncerBefore();
        bouncerBefore.barkAnimal(tiger);
        bouncerBefore.barkAnimal(lion);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion); // 입력 자료형 : Barkable, lion : BarkablePredator

        Animal tiger2 = new Tiger();
//        Predator tiger3 = new Tiger();
        Barkable tiger4 = new Tiger();
        // 같은 Tiger 클래스의 인스턴스를, Animal, Predator, Barkable 자료형으로 사용할 수 있다.
        // 다른 자료형으로 사용하면, 사용할 수 있는 메소드가 제한된다.
    }

    static void quest1() {
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue()); // 10
        // cal.minus(5); // 컴파일 에러 발생

        UpgradeCalculator upgradeCal = new UpgradeCalculator();
        upgradeCal.add(10);
        upgradeCal.minus(5);
        System.out.println(upgradeCal.getValue()); // 5
    }

    static void quest2() {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue()); // 100
    }

    static void quest3() {
        int[] data = {1, 3, 5, 7, 9};
        Calculator cal = new Calculator();
        int result = cal.avg(data);
        System.out.println(result);

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result2 = cal.avg(data2);
        System.out.println(result2);
    }

    static void quest4NE() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3)); // 정수 리스트 생성 - a에 배열의 시작 주소가 저장된다.(포인트)
        ArrayList<Integer> b = a; // 주소값 저장
        a.add(4); // a의 주소가 가르키고 있는 곳에 4 추가

        System.out.println(b.size()); // b는 a의 주소를 참조하므로(포인터이므로), b의 size()도 1개 늘어나 4가 된다.
    }

    static void quest4(){
        Calculator cal = new Calculator();
        cal.add(3); // NullPointException 제거하기
        System.out.println(cal.getValue());
    }

    static void quest5(){
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());
    }

    /*
    * Dog d = new Animal();
    * Dog는 Animal의 부모클래스가 아니므로, Animal을 Dog자료형으로 사용할 수 없고
    * 모든 동물이 개는 아니므로, 의미적으로도 옳지 않다.
    * */

    /*
    * a : Lion객체를, Animal 자료형으로 사용했으므로, Animal 자료형에 존재하는 필드와 메서드만 사용가능
    * - 2번은 Predator의 메서드이므로 사용 불가
    * b : Animal객체를 상속받은 Lion객체, Animal과 Lion속의 모든 필드와 메서드 사용가능
    * c : Lion객체를, Predator 자료형으로 사용했으므로, Predator 자료형에 존재하는 필드와 메서드만 사용가능 ( bark )
    * - 5번은 Animal의 메서드이므로 사용 불가
    * */

    static void testEnum(){
        System.out.println(CoffeeType.AMERICANO); // Enum 사용하기
    }
}