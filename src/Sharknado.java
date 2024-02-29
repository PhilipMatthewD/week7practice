public class Sharknado extends ThunderStorm {
    private double numSharks;

    public Sharknado(double latitude, double speed, double longitude, Direction direction, boolean isTornadoPresent, double numSharks) {
        super(latitude, speed, longitude, direction, isTornadoPresent);
        this.numSharks = numSharks;
    }

    public double getNumSharks() {
        return numSharks;
    }

    public void setNumSharks(double numSharks) {
        this.numSharks = numSharks;

    }
    @Override
    public void display() {
        System.out.println("There are "+numSharks+" sharks in the nado :C");
    }
}
