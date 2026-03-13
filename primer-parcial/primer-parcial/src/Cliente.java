public class Cliente {

    private String id;
    private String nombre;
    private String documento;
    private Cuenta cuenta;
    private String clave;

    public Cliente(String id, String nombre, String documento, Cuenta cuenta, String clave) {

        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.cuenta = cuenta;
        this.clave = clave;

    }

    public boolean validarClave(String claveIngresada) {

        return clave.equals(claveIngresada);

    }

    public Cuenta getCuenta() {

        return cuenta;

    }

}

