package zoo;

/*
* Dog 클래스는 Animal 클래스를 상속받음
* 개(Dog)는 동물(Animal)이다. (Dog는 Animal의 하위 클래스이다.)
* */
public class Dog extends Animal { // 상속 - 부모 클래스의 필드와 메소드를 물려받는다.
    /*
    * 기본 생성자 - 클래스 이름과 동일한 메소드
    * 다른 생성자가 없을 경우, 컴파일러가 자동으로 생성해준다. ( 하나라도 생성자가 있으면, 컴파일러가 자동으로 생성해주지 않는다. )
    * */
    public Dog(){}
    public void sleep() {
        System.out.println(this.name + " zzz");
    }
}
