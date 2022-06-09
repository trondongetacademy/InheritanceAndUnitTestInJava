public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("Ford", "Mustang");
        Car car = new Car("Ford", "Mustang",  4);
        //System.out.println(car.Brand + car.Model + " with " + car.Wheels + " wheels");

        //System.out.println(vehicles.HowfastIsThisCarGoing());
        //System.out.println(car.HowfastIsThisCarGoing());
        System.out.println(car.HowfastIsThisCarGoing());
        //System.out.println(car.MakeSomeNoise());

    }
}