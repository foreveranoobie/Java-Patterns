package builder;

import entity.Bicycle;

public class BicycleBuilderImpl implements BicycleBuilder{

    private Bicycle bicycle;

    public BicycleBuilderImpl(){
        bicycle = new Bicycle();
    }

    @Override
    public void reset() {
        bicycle = new Bicycle();
    }

    @Override
    public BicycleBuilder seatsAmount(int seatsAmount) {
        bicycle.setSeatsAmount(seatsAmount);
        return this;
    }

    @Override
    public BicycleBuilder isElectric(boolean isElectric) {
        bicycle.setElectric(isElectric);
        return this;
    }

    @Override
    public BicycleBuilder wheelsAmount(int wheelsAmount) {
        bicycle.setWheelsAmount(wheelsAmount);
        return this;
    }

    @Override
    public Bicycle build() {
        return bicycle;
    }
}
