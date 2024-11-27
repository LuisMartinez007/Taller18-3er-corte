package Taller18.Ejercicio2;

public class Prueba{
    public static void main(String[] args) {
        // Crear una instancia de CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 5000.0);

        // Realizar una transferencia
        cuenta.transferir(1000.0, "0987654321");

        // Realizar un retiro
        cuenta.retirar(500.0);

        // Pagar una factura
        cuenta.pagarFactura(2000.0, "REF123456");

        // Consultar saldo restante
        System.out.println("Saldo restante: " + cuenta.getSaldo());
    }
}
