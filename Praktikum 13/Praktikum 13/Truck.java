//Nama    :Muhammad Rayyis Budi Prasetyo
//NIM     :24060122140112
public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return super.calcFuelEfficiency() + maxLoad;
    }

    public double calcTripDistance(){
        return super.calcTripDistance() * calcFuelEfficiency() + 5;
    }

    public String toString(){
        return super.toString() + " adalah angkutan darat yang sangat handal";
    }
}