package mine;

public class MineralCalculator {
    int value = 0;

    // 매개변수의 자료형이 추가되어도, MineralCalculator 클래스를 고칠 필요가 없다!
    public void add(Mineral mineral){
        value += mineral.getValue();
    }

    public int getValue(){
        return value;
    }
}
