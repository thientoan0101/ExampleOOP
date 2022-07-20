public class Car extends Vehicle{

    int seat;

    public Car(String driverName, String licensePlate, String brand, int type, int seat) {
        super(driverName, licensePlate, brand, type);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public double calculateFreight(double km) {
        return 2;
    }
}
