package ex;

public class Rectangle {
    // attributes들
    private int width;
    private int height;

    // static 변수
    public static int numofobject = 0;

    // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        // 객체 생성시마다 객체의 개수를 증가시킴
        numofobject++;
    }

    // 넓이 구하는 메서드
    public int getArea() {
        return width * height;
    }

}
