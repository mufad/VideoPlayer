package problem_two.abstraction;


public class Runner {
    public static void main(String[]args){
        Plane plane = new Plane(3,1200, 4, 625, true);
        Car car = new Car(4, 4, 4, 120, true);

        System.out.println(plane.getNumOfPilots());
        System.out.println(plane.getTopSpeed());

        System.out.println(car.getNumOfDoors());
        System.out.println(car.has_gas());

    }
}
