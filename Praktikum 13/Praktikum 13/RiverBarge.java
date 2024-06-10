//Nama    :Muhammad Rayyis Budi Prasetyo
//NIM     :24060122140112
public class RiverBarge extends Vehicle{
    private double maxLoad;

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return super.calcFuelEfficiency() + maxLoad;
    }

    public double calcTripDistance(){
        return super.calcTripDistance() * calcFuelEfficiency() + 30;
    }
}