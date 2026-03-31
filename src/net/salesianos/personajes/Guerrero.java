package net.salesianos.personajes;

public class Guerrero extends Personaje {

    private final String arma;

    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

}
