import java.time.LocalDateTime;
import java.util.UUID;

public class Comprobante {

    private String idTx;
    private String tipoOperacion;
    private LocalDateTime fechaHora;
    private String sucursal;
    private double valorRetiro;
    private double saldoResultante;

    public Comprobante(String tipoOperacion, String sucursal, double valorRetiro, double saldoResultante) {

        this.idTx = UUID.randomUUID().toString();
        this.tipoOperacion = tipoOperacion;
        this.fechaHora = LocalDateTime.now();
        this.sucursal = sucursal;
        this.valorRetiro = valorRetiro;
        this.saldoResultante = saldoResultante;

    }

    public void imprimir() {

        System.out.println("\n===== COMPROBANTE =====");
        System.out.println("ID TX: " + idTx);
        System.out.println("Operacion: " + tipoOperacion);
        System.out.println("Fecha y Hora: " + fechaHora);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Valor Retiro: $" + valorRetiro);
        System.out.println("Saldo Resultante: $" + saldoResultante);
        System.out.println("========================");

    }

}

