package zoo;

/*
 * 인터페이스 (interface)
 * 여러객체의 공통된 부분을 추출하여, 메소드의 이름과 반환값만 정의한 것
 * 짖는다 (do)
 * */
public interface Barkable { // 인터페이스 생성

    // 추상 메소드 생성 - 인터페이스에서 생성된 함수
    void bark();

    // default 을 사용하면, 인터페이스에서 구현된 함수를 만들 수 있다.
    // static 을 사용해도, 인터페이스에 구현된 함수를 만들 수 있다. ( 자바 8부터, 기존의 static 메소드와 동일 )
    // 인터페이스 속 상수는, public static final 이 생략된 것이다. ( 자동 )
}
