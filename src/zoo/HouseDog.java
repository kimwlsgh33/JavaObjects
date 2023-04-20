package zoo;

public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) { // 오버로딩 - 같은 이름의 메소드를 여러개 정의하는 것
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    public void sleep(){ // 메소드 오버라이딩 - 부모 클래스의 메소드를 재정의(덮어쓰기)한다.
        System.out.println(this.name + " zzz in house");
    }

    public void sleep(int hour) { // 메소드 오버로딩 - 같은 이름의 메소드를 여러 개 정의할 수 있다.
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}
