import builder.BicycleBuilderImpl;
import entity.Bicycle;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new BicycleBuilderImpl().isElectric(true).seatsAmount(1).wheelsAmount(2).build();
        System.out.println(bicycle);
    }
}
