package Task1;

import Task1.Car;
import Task1.Driver;

public class Main {

    public static void main(String[] args)
    {
        Driver theDriver = new Driver("Sebastian",25);

        Car thisCar = new Car("Lamborghini", "Evo",2021,"Sport");

        Car theCar = new Car("Polestar", "2",2021,"SUV");

        thisCar.setDriver(theDriver);

        theCar.setDriver(theDriver);

        System.out.println(thisCar);
        System.out.println(theDriver);

        System.out.println(theCar);
        System.out.println(theDriver);

    }

}
