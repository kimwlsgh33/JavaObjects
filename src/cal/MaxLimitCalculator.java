package cal;

public class MaxLimitCalculator extends Calculator {
    @Override
    public void add(int x) {
        this.value += x;
        if (this.value > 100) { // x를 더한 value가 100을 넘으면, 100으로 고정한다.
            this.value = 100;
        }
    }
}
