package entity;

public class Bicycle {
    private int seatsAmount;
    private boolean isElectric;
    private int wheelsAmount;

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
            "seatsAmount=" + seatsAmount +
            ", isElectric=" + isElectric +
            ", wheelsAmount=" + wheelsAmount +
            '}';
    }
}
