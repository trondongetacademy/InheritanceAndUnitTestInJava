public class Car extends Vehicles{
    public Integer Wheels;

    public Car(String brand, String model, Integer wheels){
        super(brand, model);
        Wheels = wheels;
    }

    public String HowfastIsThisCarGoing(){
       return super.HowfastIsThisCarGoing() + " \n" + "With " + this.Wheels + " wheels" + "\n" + super.MakeSomeNoise() +
               "\n" + " or " + "\n" + this.MakeSomeNoise();
       //return super.MakeSomeNoise();
    }
    public String MakeSomeNoise(){
        return "This vehicle goes broom";
    }
}
