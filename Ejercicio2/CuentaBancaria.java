package Taller18.Ejercicio2;

public class CuentaBancaria implements Transferencia, Retiro, PagoFactura {
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Transferencia de " + monto + " a la cuenta " + cuentaDestino + " realizada con éxito.");
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado con éxito.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    @Override
    public void pagarFactura(double monto, String referencia) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Pago de factura de " + monto + " con referencia " + referencia + " realizado con éxito.");
        } else {
            System.out.println("Saldo insuficiente para pagar la factura.");
        }
    }

    // Métodos getters y setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

