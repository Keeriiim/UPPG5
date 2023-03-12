public class Car extends Vehicle{
    int doors;
    float fuelConsumption;
    int maxSpeed;

    public void setFuelConsumption(float fuelConsumption){
        this.fuelConsumption = fuelConsumption;

    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    @Override
    float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    int getMaxSpeed() {
        return maxSpeed;
    }

   

}
