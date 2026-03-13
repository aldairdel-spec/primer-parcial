public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(String numeroCuenta, double saldo, String tipoCuenta) {

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;

    }

    public void depositar(double monto) {

        saldo += monto;

    }

    public void retirar(double monto) {

        saldo -= monto;

    }

    public double consultarSaldo() {

        return saldo;

    }

}


