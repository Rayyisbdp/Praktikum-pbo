//Nama    :Muhammad Rayyis Budi Prasetyo
//NIM     :24060122140112
import java.util.*;

public class ArmadaKendaraan {
    private List<Vehicle> allArmada;
    
    public ArmadaKendaraan() {
        this.allArmada = new ArrayList<>();
    }

    public void tambahArmada(List<? extends Vehicle> armada) {
        this.allArmada.addAll(armada);
    }


    public List<Vehicle> getAllArmada() {
        return this.allArmada;
    }
}