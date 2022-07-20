public class Truck extends Vehicle{

    int capacity;

    public Truck(String driverName, String licensePlate, String brand, int type, int capacity) {
        super(driverName, licensePlate, brand, type);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateFreight(double km) {
        return 3;
    }
}
