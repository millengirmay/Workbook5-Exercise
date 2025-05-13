public class main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println("Moped color: " + slowRide.getColor());

        Car SUV = new Car();
        SUV.setNumberOfPassengers(5);
        System.out.println("Number of passenger: " + SUV.getNumberOfPassengers());


    }
}
