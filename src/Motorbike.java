import java.util.Objects;

public class Motorbike extends Vehicle {


    int miles;
    int currentMiles;


    protected Motorbike() {
        miles = 500;
        System.out.println("Motorbike created. 500 miles to go!");
    }

    protected void setDriver(Driver driver) {
        if (driver.age < 18) {
            System.out.println("Driver not changed! " + driver.name + " is " + driver.age + ", but must be 18 or older to drive Motorbike");
        } else {
            super.setDriver(driver);
            System.out.println("Driver changed to " + driver.name);
        }

    }

    protected void drive() {
        super.drive();
        if (Objects.isNull(currentDriver)) {
            System.out.println("Motorbike didn’t drive - there’s no driver!");
        } else {
            currentMiles = (miles - 10);
            miles = currentMiles;
            System.out.println("Motorbike drove 10 miles - " + currentMiles + " miles to go");
        }

    }
}
