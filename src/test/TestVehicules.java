package test;

import vehicules.Vehicule;

public class TestVehicules {
    public TestVehicules() {
    }

    public static void main(String[] args) {
        Vehicule v1 = new Vehicule();
        v1.afficherInfos();
        Vehicule v2 = new Vehicule("AB-123-CD", "Renault", "Cliot", (double)45.0F);
        v2.afficherInfos();
    }
}