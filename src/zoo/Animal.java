package zoo;

public class Animal { // 클래스 생성
    /*
    * 필드 생성 - 클래스에서 생성된 변수
    * 필드값은, 인스턴스끼리 공유되지 않는다.
    * */
    public String name;

    /*
    * 메소드 생성 - 클래스에서 생성된 함수
    * 같은 내용이 반복되는 경우, 메소드를 사용하여 코드를 간결하게 만들 수 있다.
    * */
    public void setName(String name) {
        // 매개변수 (parameter) - 메소드에 입력으로 전달된 값을 받는 변수 (String name) - name이 매개변수
        // 인수 (argument) - 메소드를 호출할 때, 입력하는 값 setName("cat") - "cat"이 인수
        this.name = name;
    }
}
