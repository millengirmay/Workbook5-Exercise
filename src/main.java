public class main {
    public static void main(String[] args) {
        /*Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println("Moped color: " + slowRide.getColor());*/

        /*Car SUV = new Car();
        SUV.setNumberOfPassengers(5);
        System.out.println("Number of passenger: " + SUV.getNumberOfPassengers());*/

        //Constructor with arguments

        Moped slowRide = new Moped("red", 4, 60, 12);
        System.out.println(slowRide.getCargoCapacity());

        SemiTruck truck = new SemiTruck("White", 2, 120, 20);
        System.out.println(truck.getNumberOfPassengers());


    }
}
