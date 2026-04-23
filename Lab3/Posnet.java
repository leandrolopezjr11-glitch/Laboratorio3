package dominio;

public class Posnet {



    public final double RECARGO_CUOTA = 0.03;
    public final int MIN_CUOTA = 1;
    public final int MAX_CUOTA = 6;

    Ticket ticket = null;

public Ticket efectuarPago(TarjetaDeCredito tarjetaDeCredito, double monto, int cantidadDeCuotas) {

    if(datosValidos(tarjetaDeCredito, monto, cantidadDeCuotas)){
        
        double montoTotal = monto + monto * recargoCuotas(cantidadDeCuotas); 
        
        if(tarjetaDeCredito.getSaldo()>= montoTotal){

            tarjetaDeCredito.setSaldo( tarjetaDeCredito.getSaldo() - montoTotal );
            
            ticket = new Ticket(tarjetaDeCredito.getNombreCompleto(), montoTotal , cantidadDeCuotas);
            

        }
    }
    
    return ticket;

}

private boolean datosValidos(TarjetaDeCredito tarjetaDeCredito, double monto, int cuotas){

    boolean tarjetaValida = tarjetaDeCredito != null;
    boolean montoValido = monto > 0; 
    boolean cuotaValida = cuotas >= MIN_CUOTA && cuotas <=MAX_CUOTA;
    return tarjetaValida && montoValido && cuotaValida;

}


private double recargoCuotas(int cuotas) {

    return (cuotas-1) * RECARGO_CUOTA;

}





}
