import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> myList = new ArrayList<>();
        float gasPrice = 19.42f;
        float distance = 200;

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.model = "M5";
        car1.speed = 220;
        car1.year = 2002;
        car1.doors = 4;
        car1.setFuelConsumption(4.5f);
        car1.setMaxSpeed(car1.speed);
        myList.add(car1);

        float fuelNeeded = distance/ car1.fuelConsumption;
        float travelCost = fuelNeeded*gasPrice;

        
        System.out.println("Distance to travel: 200 km\nFuel price: 19.42 kr/l\n");



        Car myCar = (Car) myList.get(0);
        System.out.println("Car: " + myCar.brand + " " + myCar.model + "\nModel: " + myCar.year + "\nMaxspeed: " + myCar.maxSpeed + " km/h" + "\nFuelconsumption: " +myCar.fuelConsumption+  " l/100 km" );
        System.out.println("Fuel needed: " +fuelNeeded +" l" + "\nPrice: " + travelCost +" kr");

        
    }
}
