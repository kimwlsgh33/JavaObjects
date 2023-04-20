package mine;

public class MineralCalculatorBefore {
    int value = 0;

    // 매개변수의 자료형이 추가되면, 이름은 똑같은 메서드를 반복적으로 생성해야 한다 ㅠ
    public void add(Gold gold){
        value += 100;
    }

    public void add(Silver silver){
        value += 90;
    }

    public void add(Bronze bronze){
        value += 80;
    }

    public int getValue(){
        return value;
    }
}
