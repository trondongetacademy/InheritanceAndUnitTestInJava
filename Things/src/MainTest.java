import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void TestOutcomeOfWhatCar() {

        Car car = new Car("Ford", "Mustang", 4);
        var Actual = car.Brand;
        var Actual1 = car.Model;
        var Actual2 = car.Wheels;

        var Expected = "Ford";
        var Expected1 = "Mustang";
        var Expected2 = 4;

        assertEquals(Actual , Expected);
        assertEquals(Actual1 , Expected1);
        assertEquals(Actual2 , Expected2);

    }
    @org.junit.jupiter.api.Test
    void TestOutcomeOfWrongCar() {

        Car car = new Car("Ford", "Mustang", 4);
        var Actual = car.Brand;
        var Actual1 = car.Model;
        var Actual2 = car.Wheels;

        var Expected = "Saab";
        var Expected1 = "9-3";
        var Expected2 = 2;

        assertEquals(Actual , Expected);
        assertEquals(Actual1 , Expected1);
        assertEquals(Actual2 , Expected2);

    }

}