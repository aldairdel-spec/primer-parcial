public class Cajero {

    private String idCajero;
    private String ubicacion;
    private int retirosHoy;

    public Cajero(String idCajero, String ubicacion) {

        this.idCajero = idCajero;
        this.ubicacion = ubicacion;
        this.retirosHoy = 0;

    }

    public boolean validarRetiro(double monto, Cuenta cuenta) {

        if (monto < 20000) {
            return false;
        }

        if (monto > 400000) {
            return false;
        }

        if (monto > cuenta.consultarSaldo()) {
            return false;
        }

        if (retirosHoy >= 3) {
            return false;
        }

        return true;

    }

    public void registrarRetiro() {

        retirosHoy++;

    }

}

