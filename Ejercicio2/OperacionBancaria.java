package Taller18.Ejercicio2;

public interface OperacionBancaria {
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(double monto, String referencia);
}

