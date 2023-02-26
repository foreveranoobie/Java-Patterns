import prototype.Prototype;
import prototype.impl.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(100, 30, "John");
        System.out.printf("Original human: %s\n", human);
        Prototype copy = human.clone();
        System.out.printf("Cloned human: %s\n", human);
        System.out.println(human.equals(copy));
    }
}
