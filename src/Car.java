import java.util.Objects;

public class Car extends Vehicle {

    int miles;
    int currentMiles;


    protected Car() {
        miles = 100;
        System.out.println("Car created. 100 miles to go!");
    }

    protected void setDriver(Driver driver) {
        if (driver.age < 18) {
            System.out.println("Driver not changed! " + driver.name + " is " + driver.age + ", but must be 18 or older to drive car");
        } else {
            super.setDriver(driver);
            System.out.println("Driver changed to " + driver.name);
        }

    }

    protected void drive() {
        super.drive();
        if (Objects.isNull(currentDriver)) {
            System.out.println("Car didn’t drive - there’s no driver!");
        } else {
            currentMiles = (miles - 10);
            miles = currentMiles;
            System.out.println("Car drove 10 miles - " + currentMiles + " miles to go");
        }

    }
}