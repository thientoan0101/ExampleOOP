import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    ArrayList<Vehicle> vehicles;

    public Company() {
        this.vehicles = new ArrayList<>();
    }

    public void readData(String filename) {
        try {
            File inputFile = new File(filename);
            Scanner scanner = new Scanner(inputFile);

            // dòng đầu file lưu số lượng xe
            int listSize = scanner.nextInt();

//          4
//          3
//          FFFF
//          Nguyen Van A
//          dfasdf
//          1200
//          2
//          FFFF
//          Nguyen Van A
//          dfasdf
//          12
//            2
//            FFFF
//            Nguyen Van A
//                    dfasdf
//            12
//            1
//            FFFF
//            Nguyen Van A
//                    dfasdf
//            12


            // ứng với mỗi bộ data cho mỗi xe
            // loại xe: 1 - xe máy, 2 - oto, 3 - xe tải
            // biển số xe
            // Họ tên tài xế
            // Nhãn hiệu xe
            // Lưu thông tin số chỗ của ô tô hay tải trọng của xe tải (xe máy – 0)

            Vehicle vehicle;  // tinh da hinh - polymophism

            for (int i = 0; i<listSize;i++) {
                int type = scanner.nextInt();
                String licencePlate = scanner.nextLine();
                String driverName = scanner.nextLine();
                String branch = scanner.nextLine();
                int tempSlotOrCapacity = scanner.nextInt();

                if (type == 1) {
                    vehicle = new Motobike(driverName, licencePlate, branch, type);
                } else if (type == 2) {
                    vehicle = new Car(driverName, licencePlate, branch, type, tempSlotOrCapacity);
                } else {
                    vehicle = new Truck(driverName, licencePlate, branch, type, tempSlotOrCapacity);
                }


                vehicles.add(vehicle);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public void randomLocationVehicleList() {
        for (int i = 0; i< vehicles.size(); i++) {
            vehicles.get(i).randomGPS();
        }
    }

    public double calDistance(GPS location1, GPS location2) {
        double x1 = location1.getX(), y1 = location1.getY();
        double x2 = location2.getX(), y2 = location2.getY();
        return Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    }

    public Vehicle mostSuitableVehicle(GPS customerGpsLocation, int typeCondition) {
        int idx = 1;
        double minDistance = calDistance(vehicles.get(0).getCurrentGPS(), customerGpsLocation);

        for (int i = 0; i<vehicles.size();i++) {
            double distance = calDistance(vehicles.get(i).getCurrentGPS(), customerGpsLocation);

            if (typeCondition == 3) {       // truck
                // check capacity...???
                // if (capicity ???)

                if (distance < minDistance) {
                    minDistance = distance;
                    idx = i;
                }
            } else if (typeCondition == 2) {
                // check slot...???
                // if (slot ???)

                if (distance < minDistance) {
                    minDistance = distance;
                    idx = i;
                }
            } else {
                if (distance < minDistance) {
                    minDistance = distance;
                    idx = i;
                }
            }
        }

        return vehicles.get(idx);
    }

}
