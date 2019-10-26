package problem_two.abstraction;


public class Plane extends Vehicle{

    private int numOfWheels, numOfPassengers, numOfPilots, topSpeed;
    private boolean gas;

    public Plane(int numOfWheels, int numOfPassengers, int numOfPilots, int topSpeed, boolean gas) {
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.numOfPilots = numOfPilots;
        this.topSpeed = topSpeed;
        this.gas = gas;
    }

    @Override
    int set_num_of_wheels() {
        return numOfWheels;
    }

    @Override
    int set_num_of_passengers() {
        return numOfPassengers;
    }

    @Override
    boolean has_gas() {
        return gas;
    }

    public int getNumOfPilots() {
        return numOfPilots;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
