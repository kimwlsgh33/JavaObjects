package cal;

import java.util.ArrayList;

public class Calculator {
//    public int value;
    public Integer value;

    public Calculator() {
        value = 0;
    }

//    public void add(int x) {
    public void add(int x) {
        value += x;
//        value += (Integer) x; // Integer 형 변환 int는 Integer이다, 형변환 없이도 되네, 혹시 자동 형변환되나?
    }

//    public int getValue() {
//        return value;
//    }

    public Integer getValue(){
        return value;
    }

    public Boolean isOdd(int x) { // 홀수면 2로나눈 나머지가 1, 짝수면 0
        return x % 2 != 0;
    }

    public int avg(ArrayList<Integer> nums){
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    public int avg(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum / nums.length;
    }
}
