//Nama    :Muhammad Rayyis Budi Prasetyo
//NIM     :24060122140112
public abstract class Airplane extends Vehicle implements IFleyer{
    public void takeOff(){
        System.out.println("take-off");
    }
    public void land(){
        System.out.println("mendarat");
    }
    public void fly(){
        System.out.println("terbang");
    }
}