// Proper use of inheritance to avoid excessive coupling.
public class Car implements IVehicle, IBrand { // extends Vehicle

    // Multiple inheritance
    public void displayBrand() {
        System.out.println(" Toyota \n");
    }

    // Issues with deep inheritance and preference for composition.
    public void move() {
        System.out.println(" Moving car... \n");
    }

    public void openDoors() {
        System.out.println(" Opening doors... \n");
    }

    public void closeDoors() {
        System.out.println(" Closing doors... \n");
    }

    public String getEngineType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEngineType'");
    }
}