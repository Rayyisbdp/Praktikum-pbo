//Nama    :Muhammad Rayyis Budi Prasetyo
//NIM     :24060122140112
public abstract class Vehicle {
    public double calcFuelEfficiency(){
        return 10;
    }
    public double calcTripDistance(){
        return 20;
    }
    public String toString(){
        return this.getClass().getSimpleName();
    }
}