
import net.salesianos.personajes.Guerrero;
import net.salesianos.personajes.Mago;
import net.salesianos.personajes.Personaje;

public class App {

    public static void main(String[] args) {
        Personaje viajero = new Personaje("Eldrin", 3);
        viajero.entrenar(4);
        viajero.gastarEnergia(30);
        viajero.mostrarInfo();
        Personaje.mostrarPersonajes();

    }
}
