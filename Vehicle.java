public abstract class Vehicle {
    String brand;
    String model;
    int speed;
    int year;

    abstract float getFuelConsumption(); // returnerar fordonets bränsleförbrukning i liter per 100 km
    abstract int getMaxSpeed(); // returnerar fordonets högsta hastighet i km/h
}



/* 
public class Truck extends Vehicle{

}


public class Motorcycle extends Vehicle{

}*/

