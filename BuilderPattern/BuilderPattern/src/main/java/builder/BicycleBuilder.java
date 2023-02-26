package builder;

import entity.Bicycle;

public interface BicycleBuilder {
    void reset();

    BicycleBuilder seatsAmount(int seatsAmount);

    BicycleBuilder isElectric(boolean isElectric);

    BicycleBuilder wheelsAmount(int wheelsAmount);

    Bicycle build();
}
