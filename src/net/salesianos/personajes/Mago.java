package net.salesianos.personajes;

public class Mago extends Personaje {

    private final String elemento;

    public Mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }
}
