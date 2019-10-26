package problem_two.interfaces;


public class Car implements Vehicle{

    private int numOfWheels, numOfPassengers, numOfDoors, topSpeed;
    private boolean gas;

    public Car(int numOfWheels, int numOfPassengers, int numOfDoors, int topSpeed, boolean gas) {
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.numOfDoors = numOfDoors;
        this.topSpeed = topSpeed;
        this.gas = gas;
    }

    @Override
    public int set_num_of_wheels() {
        return numOfWheels;
    }

    @Override
    public int set_num_of_passengers() {
        return numOfPassengers;
    }

    @Override
    public boolean has_gas() {
        return gas;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
