public class Kod {

     //  System.out.println(car1);                 // prints the memoryadress of car
        //    System.out.println(myList.get(0));      // prints the memoryadress of car

        
   /*  *********** METOD 1 ********** UTAN CONSTRUCTOR
   abstract class Vehicle {
        String brand;
        String model;
        int speed;
        int year;
    
        // Abstract method
        abstract float getFuelConsumption();
    }
    
    class Car extends Vehicle {
        int doors;
        float fuelConsumption;
        int maxSpeed;
    
        public void setFuelConsumption(float fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
        }
    
        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
    
        @Override
        float getFuelConsumption() {
            return fuelConsumption;
        }
    
        //...
    }


********* MAIN **********
Car myCar = new Car();
myCar.setBrand("BMW");
myCar.setModel("M5");
myCar.setSpeed(220);
myCar.setYear(2002);
myCar.setDoors(4);
myCar.setFuelConsumption(9.5f);
myCar.setMaxSpeed(300);

float fuelConsumption = myCar.getFuelConsumption();
System.out.println("Fuel consumption: " + fuelConsumption);





******'* METOD 2 ***********  MED CONSTRUCTOR
class Car extends Vehicle {
    int doors;
    float fuelConsumption;
    int maxSpeed;

    public Car(String brand, String model, int speed, int year, int doors, float fuelConsumption, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
        this.doors = doors;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    
}





***** MAIN *****
Car myCar = new Car("BMW", "M5", 220, 2002, 4, 9.5f, 300);


    */
}
