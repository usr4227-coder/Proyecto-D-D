package net.salesianos.personajes;

public class Guerrero extends Personaje {

    private final String arma;

    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nGuerrero: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Energía: " + getEnergia());
        System.out.println("Arma: " + arma);
    }

    public void ataquePesado() {
        energia = energia - 15;
        if (energia < 0) {
            energia = 0;
        }
    }
}
