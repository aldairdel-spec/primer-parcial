import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cuenta cuenta = new Cuenta("12345", 435000, "Ahorros");
        Cliente cliente = new Cliente("1", "Juan", "123456", cuenta, "1234");
        Cajero cajero = new Cajero("C1", "Cajero Centro");

        System.out.println("Ingrese clave de 4 digitos:");
        String clave = sc.nextLine();

        if (cliente.validarClave(clave)) {

            int opcion;

            do {

                System.out.println("\n===== MENU =====");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Salir");

                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("Saldo actual: $" + cuenta.consultarSaldo());

                        Comprobante comprobanteSaldo = new Comprobante(
                                "Consulta de saldo",
                                "Cajero Centro",
                                0,
                                cuenta.consultarSaldo()
                        );

                        comprobanteSaldo.imprimir();

                        break;

                    case 2:

                        System.out.println("Monto a retirar:");
                        double monto = sc.nextDouble();

                        if (cajero.validarRetiro(monto, cuenta)) {

                            cuenta.retirar(monto);
                            cajero.registrarRetiro();

                            System.out.println("Retiro exitoso");

                            Comprobante comprobante = new Comprobante(
                                    "Retiro",
                                    "Cajero Centro",
                                    monto,
                                    cuenta.consultarSaldo()
                            );

                            comprobante.imprimir();

                        } else {

                            System.out.println("Retiro no permitido");

                        }

                        break;

                    case 3:
                        System.out.println("Gracias por usar el cajero");
                        break;

                    default:
                        System.out.println("Opcion invalida");

                }

            } while (opcion != 3);

        } else {

            System.out.println("Clave incorrecta");

        }

    }
}