package planes;

import java.util.Objects;

public class PassengerPlane extends Plane{
    private final int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return "passengerPlane{model='" + model + "'" +
                ", maxSpeed=" + this.getMaxSpeed() +
                ", maxFlightDistance=" + this.getMaxFlightDistance() +
                ", maxLoadCapacity=" + this.getMaxLoadCapacity() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }

         @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
