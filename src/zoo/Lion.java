package zoo;

// 사자는, 동물이다(is), 포식한다(do), 짖는다(do)
//public class Lion extends Animal implements BarkablePredator {
public class Lion extends Predator implements Barkable {
    @Override
    public String getFood() {
        return "banana";
    }

    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}
