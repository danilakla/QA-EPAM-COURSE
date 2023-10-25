package planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private final MilitaryType militaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return "militaryPlane{model='" + model + "'" +
                ", maxSpeed=" + this.getMaxSpeed() +
                ", maxFlightDistance=" + this.getMaxFlightDistance() +
                ", maxLoadCapacity=" + this.getMaxLoadCapacity() +
                '}';
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), militaryType); }

         @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
