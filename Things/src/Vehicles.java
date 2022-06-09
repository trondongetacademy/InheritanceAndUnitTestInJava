public class Vehicles {
    public String Brand;
    public String Model;
    public Integer Speed = 100;

    public Vehicles(String brand, String model){
        Brand = brand;
        Model = model;
        //Speed = speed
    }
    public String HowfastIsThisCarGoing(){
        return  "Brand: " + this.Brand + "\n" + "Model " + this.Model + "\n" + "Speed " + this.Speed;
    }

    public String MakeSomeNoise(){
        return "This vehicle goes WROOOOOMMM";

    }
}
