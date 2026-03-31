package net.salesianos.personajes;

public class Mago extends Personaje {

    private final String elemento;

    public Mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nNivel del mago: " + getNivel());
        System.out.println("Elemento: " + elemento);
    }

    public void ataqueElemental() {
        energia = energia - 25;
        if (energia < 0) {
            energia = 0;
        }
    }
 public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

}
