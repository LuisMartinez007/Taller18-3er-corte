package Taller18.Ejercicio3;

public class Prueba{
    public static void main(String[] args) {
        // Crear una instancia de Camion
        Camion camion = new Camion(5000.0); // Capacidad de carga de 5000 kg

        // Realizar operaciones de conducción y carga
        camion.conducir();
        camion.cargarMercancias(2000.0);
        camion.cargarMercancias(3500.0); // Esto excede la capacidad de carga

        // Crear una instancia de Automovil
        Automovil automovil = new Automovil();

        // Realizar operación de conducción
        automovil.conducir();
    }
}
