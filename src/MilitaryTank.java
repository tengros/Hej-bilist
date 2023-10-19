import java.util.Objects;

public class MilitaryTank extends Vehicle {

    int miles;
    int currentMiles;

    protected MilitaryTank() {
        miles = 2000;
        System.out.println("Tank created. 2000 miles to go!");
    }

    protected void setDriver(Driver driver) {
        if (driver.age < 25) {
            System.out.println("Driver not changed! " + driver.name + " is " + driver.age + ", but must be 25 or older to drive tank");
        } else {
            super.setDriver(driver);
            System.out.println("Driver changed to " + driver.name);
        }
    }

    protected void drive() {
        super.drive();
        if (Objects.isNull(currentDriver)) {
            System.out.println("Tank didn’t drive - there’s no driver!");
        } else {
            currentMiles = (miles - 5);
            miles = currentMiles;
            System.out.println("Tank drove 5 miles - " + currentMiles + " miles to go");
        }
    }
}