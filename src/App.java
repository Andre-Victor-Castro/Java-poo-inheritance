public class App {
    public static void main(String[] args) throws Exception {
        // Proper use of inheritance to avoid excessive coupling.
        IVehicle car1 = new Car(); // Vehicle car1 = new Car()
        IVehicle motorcycle1 = new Motorcycle(); // Vehicle motorcycle1 = new Motorcycle()

        System.out.println(" ---- Car ---- \n");
        if (car1 instanceof Car) {
            ((Car) car1).openDoors();
            ((Car) car1).closeDoors();
        }
        car1.move();

        System.out.println(" ---- Motorcycle ---- \n");
        motorcycle1.move();
        if (motorcycle1 instanceof Motorcycle) {
            ((Motorcycle) motorcycle1).rearBrake();
            ((Motorcycle) motorcycle1).frontBrake();
        }
    }
}
