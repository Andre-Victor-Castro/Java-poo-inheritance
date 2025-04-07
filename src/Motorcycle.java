// Proper use of inheritance to avoid excessive coupling.
public class Motorcycle implements IVehicle, IBrand { // extends Vehicle

    // Multiple inheritance
    public void displayBrand() {
        System.out.println(" Honda \n");
    }
    
    // Issues with deep inheritance and preference for composition.
    public void move() {
        System.out.println(" Moving motorcycle... \n");
    }

    public void frontBrake() {
        System.out.println(" Activating front brake... \n");
    }

    public void rearBrake() {
        System.out.println(" Activating rear brake... \n");
    }
}