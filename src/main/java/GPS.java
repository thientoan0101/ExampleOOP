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

}
