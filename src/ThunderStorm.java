public class ThunderStorm extends Storm{
    private boolean isTornadoPresent;

    public ThunderStorm(double latitude, double speed, double longitude, Direction direction, boolean isTornadoPresent) {
        super(latitude, speed, longitude, direction);

        this.isTornadoPresent = isTornadoPresent;
    }

    public boolean isTornadoPresent() {
        return isTornadoPresent;
    }

    public void setTornadoPresent(boolean tornadoPresent) {
        isTornadoPresent = tornadoPresent;
    }

    @Override
    public void display() {
        System.out.println("there is a tornado = " + isTornadoPresent);
    }
}
