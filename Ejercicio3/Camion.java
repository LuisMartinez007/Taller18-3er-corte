package Taller18.Ejercicio3;

public class Camion implements Conducir, CargarMercancias {
    private double capacidadCarga;
    private double cargaActual;

    // Constructor
    public Camion(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = 0;
    }

    @Override
    public void conducir() {
        System.out.println("El camión está en movimiento.");
    }

    @Override
    public void cargarMercancias(double peso) {
        if (cargaActual + peso <= capacidadCarga) {
            cargaActual += peso;
            System.out.println("Cargando " + peso + " kg. Carga actual: " + cargaActual + " kg.");
        } else {
            System.out.println("No se puede cargar " + peso + " kg. Excede la capacidad de carga.");
        }
    }

    // Métodos getters y setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }
}

