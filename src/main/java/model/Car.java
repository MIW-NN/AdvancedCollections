package model;

/**
 * @author Vincent Velthuizen
 * A simple class to be used to demo the datastructures
 */
public class Car {
    private String kenteken;
    private String make;
    private String model;
    private int yearBuild;

    public Car(String kenteken, String make, String model, int yearBuild) {
        this.kenteken = kenteken;
        this.make = make;
        this.model = model;
        this.yearBuild = yearBuild;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;

        return kenteken.equals(car.kenteken);
    }

    @Override
    public int hashCode() {
        return kenteken.hashCode();
    }
}
