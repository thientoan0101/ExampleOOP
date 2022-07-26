import java.util.Scanner;

public class GPS {
    double x;
    double y;


    // default constructor
    public GPS() {
        this.x = 0;
        this.y = 0;
    }

    // parameter constructor
    public GPS(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // getter - setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static GPS inputGPS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x: ");
        double x = scanner.nextDouble();
        System.out.println("nhap y: ");
        double y = scanner.nextDouble();
        GPS newGPS = new GPS(x, y);
        return newGPS;
    }
}
