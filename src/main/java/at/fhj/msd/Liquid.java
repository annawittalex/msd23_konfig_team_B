package at.fhj.msd;

/**
 * Represents a liquid with a name, volume in liters, and alcohol percentage.
 */
public class Liquid {

    private String name;

    private double volume;

    private double alcoholPercent;


    /**
     * Constructs a new Liquid object with the specified name, volume, and alcohol percentage.
     *
     * @param name           the name of the liquid
     * @param volume         the volume of the liquid in liters
     * @param alcoholPercent the alcohol percentage of the liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
