import singleton.Sun;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        System.out.println(sun);
        Sun secondSun = Sun.getInstance();
        System.out.println(secondSun);
    }
}
