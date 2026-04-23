import dominio.Posnet;
import dominio.TarjetaDeCredito;
import dominio.Ticket;
import dominio.Titular;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Titular titular = new Titular("12345", "vicente", "cerso", "555555", "v.cerso@gmail.com");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("galicia", "12345", 15000, "Franco Couturier");
        Posnet posnet = new Posnet();

        Ticket ticket = posnet.efectuarPago(tarjetaDeCredito, 10000, 5);

        System.out.println(ticket.getMontoTotal()  + " " + ticket.getMontoCuota() + " " +ticket.getNombreCompleto());
    }
}
