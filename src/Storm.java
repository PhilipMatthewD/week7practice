enum Direction{NORTH, SOUTH, EAST, WEST};
public class Storm {
    private double latitude;
    private double longitude;
    private double speed;
    private Direction direction;
    static int numStorms;

    public Storm(){
        numStorms++;
    }

    public Storm(double latitude, double speed, double longitude, Direction direction) {
        this.latitude = latitude;
        this.speed = speed;
        this.longitude = longitude;
        this.direction = direction;

        numStorms++;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void display(){
        System.out.println("The storm is currently at " + latitude +", "+ longitude+" and is going " +speed + " fast"+ direction);
    }
}
