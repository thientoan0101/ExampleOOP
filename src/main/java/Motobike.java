public class Motobike extends Vehicle{
    public Motobike(String driverName, String licensePlate, String brand, int type) {
        super(driverName, licensePlate, brand, type);
    }

    @Override
    public double calculateFreight(double km) {
        return 1;
    }
}
